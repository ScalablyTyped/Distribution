package typings.officeUiFabricReact.listListMod

import typings.officeUiFabricReact.listTypesMod.IListProps
import typings.officeUiFabricReact.listTypesMod.IPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IListState[T] extends js.Object {
  
  def getDerivedStateFromProps(nextProps: IListProps[T], previousState: IListState[T]): IListState[T] = js.native
  
  var isScrolling: js.UndefOr[Boolean] = js.native
  
  /** The last versionstamp for  */
  var measureVersion: js.UndefOr[Double] = js.native
  
  var pages: js.UndefOr[js.Array[IPage[T]]] = js.native
  
  var pagesVersion: js.UndefOr[js.Object] = js.native
}
object IListState {
  
  @scala.inline
  def apply[T](getDerivedStateFromProps: (IListProps[T], IListState[T]) => IListState[T]): IListState[T] = {
    val __obj = js.Dynamic.literal(getDerivedStateFromProps = js.Any.fromFunction2(getDerivedStateFromProps))
    __obj.asInstanceOf[IListState[T]]
  }
  
  @scala.inline
  implicit class IListStateOps[Self <: IListState[_], T] (val x: Self with IListState[T]) extends AnyVal {
    
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
    def setGetDerivedStateFromProps(value: (IListProps[T], IListState[T]) => IListState[T]): Self = this.set("getDerivedStateFromProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsScrolling: Self = this.set("isScrolling", js.undefined)
    
    @scala.inline
    def setMeasureVersion(value: Double): Self = this.set("measureVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureVersion: Self = this.set("measureVersion", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: IPage[T]*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[IPage[T]]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setPagesVersion(value: js.Object): Self = this.set("pagesVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagesVersion: Self = this.set("pagesVersion", js.undefined)
  }
}
