package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.DesignPropertyValue")
@js.native
open class DesignPropertyValue protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def booleanValue: Boolean = js.native
  def booleanValue_=(newValue: Boolean): Unit = js.native
  
  def containerAsAppearance: Appearance = js.native
  
  def key: String = js.native
  def key_=(newValue: String): Unit = js.native
  
  def stringValue: String = js.native
  def stringValue_=(newValue: String): Unit = js.native
  
  def `type`: DesignPropertyValueType = js.native
  def type_=(newValue: DesignPropertyValueType): Unit = js.native
}
object DesignPropertyValue {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.DesignPropertyValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DesignPropertyValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): DesignPropertyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DesignPropertyValue]
  
  /**
    * Creates and returns a new DesignPropertyValue instance in the SDK and on the server.
    * The new DesignPropertyValue will be automatically stored in the 'designProperties' property
    * of the parent Appearance element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createIn(container: Appearance): DesignPropertyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DesignPropertyValue]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.DesignPropertyValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.DesignPropertyValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
