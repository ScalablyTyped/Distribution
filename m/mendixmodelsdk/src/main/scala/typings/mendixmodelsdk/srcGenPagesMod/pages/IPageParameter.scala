package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IDataType
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.4.0: introduced
  */
@js.native
trait IPageParameter
  extends StObject
     with IElement
     with IByNameReferrable {
  
  val containerAsPage: IPage = js.native
  
  @JSName("model")
  val model_IPageParameter: IModel = js.native
  
  val name: String = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  val parameterType: IDataType = js.native
}
