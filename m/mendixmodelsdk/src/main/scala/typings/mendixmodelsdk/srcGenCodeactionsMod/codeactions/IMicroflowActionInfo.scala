package typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenImagesMod.images.IImage
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@js.native
trait IMicroflowActionInfo
  extends StObject
     with IElement {
  
  val caption: String = js.native
  
  val category: String = js.native
  
  val containerAsCodeAction: ICodeAction = js.native
  
  val containerAsMicroflow: IMicroflow = js.native
  
  /**
    * In version 9.10.0: deleted
    */
  val icon: IImage | Null = js.native
  
  val iconQualifiedName: String | Null = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  val imageData: String | Null = js.native
  
  @JSName("model")
  val model_IMicroflowActionInfo: IModel = js.native
}
