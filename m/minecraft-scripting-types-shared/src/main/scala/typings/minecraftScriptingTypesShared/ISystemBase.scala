package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedBooleans.`true`
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.item_entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISystemBase extends StObject {
  
  /**
    * By default no filters are added. This will allow queries to capture all entities.
    * @param ComponentName This is the identifier of the component that will be added to the filter list. Only entities that have that component will be listed in the view
    */
  def addFilterToQuery(query: IQuery, ComponentName: String): Unit = js.native
  
  /**
    * Applies the component and any changes made to it in script back to the entity. What this means for each component can be slightly 
    * different: it makes the component reload on the entity with the new data as if it had just been added to the entity.
    * @param component The component object retrieved from the entity that was returned by either createComponent() or getComponent()
    */
  def applyComponentChanges(entity: IEntity, component: IComponent[Any]): `true` | Null = js.native
  
  /**
    * Creates an empty entity with no components and does not place it in the world.
    */
  def createEntity(): IEntity | Null = js.native
  /**
    * Creates an entity and applies the specified template as defined in JSON. This allows you to quickly create an entity from the 
    * applied Behavior Packs as the base for an entity created in scripting. The entity will be spawned into the world with all the 
    * components, component groups, and event triggers that are defined in the JSON file of the identifier specified.
    * @param type Specifies the type of the entity that is being created by the template. Valid inputs are `entity` and `item_entity`
    * @param templateIdentifier This can be any of the entity identifiers from the applied Behavior Packs. For example specifying minecraft:cow here will make the provided entity a cow as defined in JSON
    */
  def createEntity(`type`: entity | item_entity, templateIdentifier: String): IEntity | Null = js.native
  
  /**
    * Removes the specified component from the given entity. If the entity has the component, it will be removed. Currently this only works with custom components and can't be used to remove components defined for an entity in JSON.
    * @param entity The EntityObject that was retrieved from a call to createEntity() or retrieved from an event
    * @param componentIdentifier The name of the component to remove from the entity. This is either the name of a built-in component (check the Script Components section) or a custom component created with a call to registerComponent()
    */
  def destroyComponent(entity: IEntity, componentIdentifier: String): `true` | Null = js.native
  
  /**
    * Destroys an entity identified by the EntityObject. If the entity exists in the world this will remove it from the world and 
    * destroy it. This also makes the EntityObject no longer valid - you should only destroy an entity after you are done with it and 
    * no longer need to reference it again. This does NOT kill the entity. There won't be an event for its death: it will be removed.
    * @param entity The IEntityObject that was retrieved from a call to createEntity() or retrieved from an event
    */
  def destroyEntity(entity: IEntity): `true` | Null = js.native
  
  /**
    * Allows you to fetch the entities captured by a query.
    * @param query This is the query you registered earlier using `registerQuery()`
    * @returns An array of IEntityObjects representing the entities found within the query
    */
  def getEntitiesFromQuery(query: IQuery): js.Array[IEntity] = js.native
  /**
    * Allows you to fetch the entities captured by a spatial query.
    * @param query This is the query you created earlier using `registerQuery(...)`
    * @param componentField1Min The minimum value that the first component field needs to be on an entity for that entity to be included in the query
    * @param componentField2Min The minimum value that the second component field needs to be on an entity for that entity to be included in the query
    * @param componentField3Min The minimum value that the third component field needs to be on an entity for that entity to be included in the query
    * @param componentField1Max The maximum value that the first component field needs to be on an entity for that entity to be included in the query
    * @param componentField2Max The maximum value that the second component field needs to be on an entity for that entity to be included in the query
    * @param componentField3Max The maximum value that the third component field needs to be on an entity for that entity to be included in the query
    */
  def getEntitiesFromQuery(
    query: IQuery,
    componentField1Min: Double,
    componentField2Min: Double,
    componentField3Min: Double,
    componentField1Max: Double,
    componentField2Max: Double,
    componentField3Max: Double
  ): js.Array[IEntity] = js.native
  
  /**
    * Checks if the given EntityObject corresponds to a valid entity.
    * @param entity The EntityObject that was retrieved from a call to createEntity() or retrieved from an event
    */
  def isValidEntity(entity: IEntity): Boolean | Null = js.native
  
  /**
    * User-Defined components are a special kind of component that can be defined in script and no built-in game system acts on it.
    * The component needs to be registered with the Script Engine by giving it a name and a set of fields in the format name:value. 
    * Once applied, the component behaves like any of the built-in components: you can get it from an entity, modify its values, and 
    * apply the changes.
    * Currently User-Defined components are the only components that can be dynamically added and removed from an entity using scripts. 
    * They don't need to be previously defined in an entity's JSON file. In the current version these components will NOT be saved out or 
    * loaded back in: they only exist while the entity is there and need to be added back when reloading the level.
    * @param componentIdentifier The name of the custom component. It is required to use a namespace so you can uniquely refer to it later without overlapping a name with a built-in component: for example 'myPack:myCustomComponent'
    * @param componentData A JavaScript Object that defines the name of the fields and the data each field holds inside the component.
    * @returns true if successful, null if an error occurred
    */
  def registerComponent(componentIdentifier: String, componentData: js.Object): `true` | Null = js.native
}
