package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.playcanvas.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The AnimationComponentSystem manages creating and deleting AnimationComponents.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "AnimationComponentSystem")
@js.native
open class AnimationComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ AnimationComponentSystem, /* entity */ Entity, AnimationComponent] = js.native
  
  var DataType: Instantiable0[AnimationComponentData] = js.native
  
  var id: String = js.native
  
  /**
    * Called during {@link ComponentSystem#addComponent} to initialize the component data in the
    * store. This can be overridden by derived Component Systems and either called by the derived
    * System or replaced entirely.
    *
    * @param {AnimationComponent} component - The component being initialized.
    * @param {object} data - The data block used to initialize the component.
    * @param {Array<string | {name: string, type: string}>} properties - The array of property descriptors for the component.
    * A descriptor can be either a plain property name, or an object specifying the name and type.
    * @ignore
    */
  def initializeComponentData(component: AnimationComponent, data: js.Object, properties: js.Array[String | Type]): Unit = js.native
  
  /**
    * @param {import('../../entity.js').Entity} entity - The entity having its component removed.
    * @param {AnimationComponent} component - The component being removed.
    * @private
    */
  /* private */ var onBeforeRemove: Any = js.native
  
  /**
    * @param {number} dt - The time delta since the last frame.
    * @private
    */
  /* private */ var onUpdate: Any = js.native
  
  @JSName("schema")
  var schema_AnimationComponentSystem: js.Array[String] = js.native
}
