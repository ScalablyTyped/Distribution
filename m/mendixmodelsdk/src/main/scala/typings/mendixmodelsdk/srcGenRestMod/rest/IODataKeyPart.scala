package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttributeType
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.9.0: introduced
  */
@js.native
trait IODataKeyPart
  extends StObject
     with IElement {
  
  val containerAsODataKey: IODataKey = js.native
  
  @JSName("model")
  val model_IODataKeyPart: IModel = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  val `type`: IAttributeType = js.native
}
