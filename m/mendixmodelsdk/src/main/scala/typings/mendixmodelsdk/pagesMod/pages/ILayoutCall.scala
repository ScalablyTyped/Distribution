package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.17.0: added public
  */
@js.native
trait ILayoutCall
  extends StObject
     with IElement {
  
  val containerAsLayout: ILayout = js.native
  
  val containerAsPage: IPage = js.native
  
  val containerAsPageTemplate: IPageTemplate = js.native
  
  val containerAsWebLayoutContent: IWebLayoutContent = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.0.0: removed optional
    * In version 7.17.0: added public
    */
  val layout: ILayout | Null = js.native
  
  val layoutQualifiedName: String | Null = js.native
  
  @JSName("model")
  val model_ILayoutCall: IModel = js.native
}
