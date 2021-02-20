package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/attributes relevant section in reference guide}
  */
@js.native
trait IAttribute
  extends IElement
     with IByNameReferrable {
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.13.0: introduced
    */
  val capabilities: IAttributeCapabilities = js.native
  
  val containerAsEntity: IEntity = js.native
  
  @JSName("model")
  val model_IAttribute: IModel = js.native
  
  val name: String = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  val `type`: IAttributeType = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 6.6.0: added public
    */
  val value: IValueType = js.native
}
