package typings.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "shape.toJSON()". */
@js.native
trait ShapeData extends js.Object {
  
  /**
    *
    * Returns the Comments Collection. Read-only.
    *
    * [Api set:  1.1]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.native
  
  /**
    *
    * Returns the Hyperlinks collection for a Shape object. Read-only.
    *
    * [Api set:  1.1]
    */
  var hyperlinks: js.UndefOr[js.Array[HyperlinkData]] = js.native
  
  /**
    *
    * Shape's identifier. Read-only.
    *
    * [Api set:  1.1]
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    *
    * Shape's name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the Shape's Data Section. Read-only.
    *
    * [Api set:  1.1]
    */
  var shapeDataItems: js.UndefOr[js.Array[ShapeDataItemData]] = js.native
  
  /**
    *
    * Gets SubShape Collection. Read-only.
    *
    * [Api set:  1.1]
    */
  var subShapes: js.UndefOr[js.Array[ShapeData]] = js.native
  
  /**
    *
    * Shape's text. Read-only.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    *
    * Returns the view of the shape. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[ShapeViewData] = js.native
}
object ShapeData {
  
  @scala.inline
  def apply(): ShapeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeData]
  }
  
  @scala.inline
  implicit class ShapeDataOps[Self <: ShapeData] (val x: Self) extends AnyVal {
    
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
    def setCommentsVarargs(value: CommentData*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentData]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setHyperlinksVarargs(value: HyperlinkData*): Self = this.set("hyperlinks", js.Array(value :_*))
    
    @scala.inline
    def setHyperlinks(value: js.Array[HyperlinkData]): Self = this.set("hyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlinks: Self = this.set("hyperlinks", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setShapeDataItemsVarargs(value: ShapeDataItemData*): Self = this.set("shapeDataItems", js.Array(value :_*))
    
    @scala.inline
    def setShapeDataItems(value: js.Array[ShapeDataItemData]): Self = this.set("shapeDataItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeDataItems: Self = this.set("shapeDataItems", js.undefined)
    
    @scala.inline
    def setSubShapesVarargs(value: ShapeData*): Self = this.set("subShapes", js.Array(value :_*))
    
    @scala.inline
    def setSubShapes(value: js.Array[ShapeData]): Self = this.set("subShapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubShapes: Self = this.set("subShapes", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setView(value: ShapeViewData): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
