package typings.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "page.toJSON()". */
@js.native
trait PageData extends js.Object {
  /**
    *
    * All shapes in the Page, including subshapes. Read-only.
    *
    * [Api set:  1.1]
    */
  var allShapes: js.UndefOr[js.Array[ShapeData]] = js.native
  /**
    *
    * Returns the Comments Collection.  Read-only.
    *
    * [Api set:  1.1]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.native
  /**
    *
    * Returns the height of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var height: js.UndefOr[Double] = js.native
  /**
    *
    * Index of the Page. Read-only.
    *
    * [Api set:  1.1]
    */
  var index: js.UndefOr[Double] = js.native
  /**
    *
    * Whether the page is a background page or not. Read-only.
    *
    * [Api set:  1.1]
    */
  var isBackground: js.UndefOr[Boolean] = js.native
  /**
    *
    * Page name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * All top-level shapes in the Page.Read-only.
    *
    * [Api set:  1.1]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.native
  /**
    *
    * Returns the view of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[PageViewData] = js.native
  /**
    *
    * Returns the width of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var width: js.UndefOr[Double] = js.native
}

object PageData {
  @scala.inline
  def apply(): PageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageData]
  }
  @scala.inline
  implicit class PageDataOps[Self <: PageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllShapesVarargs(value: ShapeData*): Self = this.set("allShapes", js.Array(value :_*))
    @scala.inline
    def setAllShapes(value: js.Array[ShapeData]): Self = this.set("allShapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllShapes: Self = this.set("allShapes", js.undefined)
    @scala.inline
    def setCommentsVarargs(value: CommentData*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[CommentData]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setIsBackground(value: Boolean): Self = this.set("isBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBackground: Self = this.set("isBackground", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setShapesVarargs(value: ShapeData*): Self = this.set("shapes", js.Array(value :_*))
    @scala.inline
    def setShapes(value: js.Array[ShapeData]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
    @scala.inline
    def setView(value: PageViewData): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

