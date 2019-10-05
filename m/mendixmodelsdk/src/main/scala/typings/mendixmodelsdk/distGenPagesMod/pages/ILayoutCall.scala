package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.17.0: added public
  */
@js.native
trait ILayoutCall extends IElement {
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

