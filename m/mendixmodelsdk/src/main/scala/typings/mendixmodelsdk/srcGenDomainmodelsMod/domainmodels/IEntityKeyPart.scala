package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.9.0: introduced
  */
@js.native
trait IEntityKeyPart
  extends StObject
     with IElement
     with IByNameReferrable {
  
  val containerAsEntityKey: IEntityKey = js.native
  
  @JSName("model")
  val model_IEntityKeyPart: IModel = js.native
  
  val name: String = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  val `type`: IAttributeType = js.native
}
