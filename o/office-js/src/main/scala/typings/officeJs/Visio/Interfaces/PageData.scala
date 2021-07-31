package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "page.toJSON()". */
trait PageData extends StObject {
  
  /**
    *
    * All shapes in the Page, including subshapes. Read-only.
    *
    * [Api set:  1.1]
    */
  var allShapes: js.UndefOr[js.Array[ShapeData]] = js.undefined
  
  /**
    *
    * Returns the Comments Collection.  Read-only.
    *
    * [Api set:  1.1]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.undefined
  
  /**
    *
    * Returns the height of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Index of the Page. Read-only.
    *
    * [Api set:  1.1]
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Whether the page is a background page or not. Read-only.
    *
    * [Api set:  1.1]
    */
  var isBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Page name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * All top-level shapes in the Page.Read-only.
    *
    * [Api set:  1.1]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.undefined
  
  /**
    *
    * Returns the view of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[PageViewData] = js.undefined
  
  /**
    *
    * Returns the width of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object PageData {
  
  @scala.inline
  def apply(): PageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageData]
  }
  
  @scala.inline
  implicit class PageDataMutableBuilder[Self <: PageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllShapes(value: js.Array[ShapeData]): Self = StObject.set(x, "allShapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllShapesUndefined: Self = StObject.set(x, "allShapes", js.undefined)
    
    @scala.inline
    def setAllShapesVarargs(value: ShapeData*): Self = StObject.set(x, "allShapes", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentData]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentData*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIsBackground(value: Boolean): Self = StObject.set(x, "isBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBackgroundUndefined: Self = StObject.set(x, "isBackground", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setShapes(value: js.Array[ShapeData]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: ShapeData*): Self = StObject.set(x, "shapes", js.Array(value :_*))
    
    @scala.inline
    def setView(value: PageViewData): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
