package typings.mcustomscrollbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlwaysTriggerOffsets extends js.Object {
  
  /**
    * Set the behavior of calling onTotalScroll and onTotalScrollBack offsets.
    * By default, callback offsets will trigger repeatedly while content is scrolling within the offsets.
    * Set alwaysTriggerOffsets: false when you need to trigger onTotalScroll and onTotalScrollBack callbacks once, each time scroll end or beginning is reached.
    */
  var alwaysTriggerOffsets: js.UndefOr[Boolean] = js.native
  
  /**
    * A function to call right before scrollbar(s) are updated.
    */
  var onBeforeUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function to call when plugin markup is created.
    */
  var onCreate: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function to call each time an image inside the element is fully loaded and scrollbar(s) are updated.
    */
  var onImageLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function to call when scrollbars have initialized
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function to call when content becomes wide enough and horizontal scrollbar is added.
    */
  var onOverflowX: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function to call when content becomes narrow enough and horizontal scrollbar is removed.
    */
  var onOverflowXNone: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function to call when content becomes long enough and vertical scrollbar is added.
    */
  var onOverflowY: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function to call when content becomes short enough and vertical scrollbar is removed.
    */
  var onOverflowYNone: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * User defined callback function, triggered on scroll event. Call your own function(s) each time a scroll event completes
    */
  var onScroll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * User defined callback function, triggered on scroll start event. You can call your own function(s) each time a scroll event begins
    */
  var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function to call each time a type of element is added, removed or changes its size and scrollbar(s) are updated.
    */
  var onSelectorChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function to call when scrolling is completed and content is scrolled all the way to the end (bottom/right)
    */
  var onTotalScroll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A function to call when scrolling is completed and content is scrolled back to the beginning (top/left)
    */
  var onTotalScrollBack: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Set an offset for which the onTotalScrollBack callback is triggered.
    * Its value is in pixels
    */
  var onTotalScrollBackOffset: js.UndefOr[Double] = js.native
  
  /**
    * Set an offset for which the onTotalScroll callback is triggered.
    * Its value is in pixels.
    */
  var onTotalScrollOffset: js.UndefOr[Double] = js.native
  
  /**
    * A function to call when scrollbar(s) are updated.
    */
  var onUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * User defined callback function, triggered while scrolling
    */
  var whileScrolling: js.UndefOr[js.Function0[Unit]] = js.native
}
object AlwaysTriggerOffsets {
  
  @scala.inline
  def apply(): AlwaysTriggerOffsets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlwaysTriggerOffsets]
  }
  
  @scala.inline
  implicit class AlwaysTriggerOffsetsOps[Self <: AlwaysTriggerOffsets] (val x: Self) extends AnyVal {
    
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
    def setAlwaysTriggerOffsets(value: Boolean): Self = this.set("alwaysTriggerOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysTriggerOffsets: Self = this.set("alwaysTriggerOffsets", js.undefined)
    
    @scala.inline
    def setOnBeforeUpdate(value: () => Unit): Self = this.set("onBeforeUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBeforeUpdate: Self = this.set("onBeforeUpdate", js.undefined)
    
    @scala.inline
    def setOnCreate(value: () => Unit): Self = this.set("onCreate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCreate: Self = this.set("onCreate", js.undefined)
    
    @scala.inline
    def setOnImageLoad(value: () => Unit): Self = this.set("onImageLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnImageLoad: Self = this.set("onImageLoad", js.undefined)
    
    @scala.inline
    def setOnInit(value: () => Unit): Self = this.set("onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setOnOverflowX(value: () => Unit): Self = this.set("onOverflowX", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOverflowX: Self = this.set("onOverflowX", js.undefined)
    
    @scala.inline
    def setOnOverflowXNone(value: () => Unit): Self = this.set("onOverflowXNone", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOverflowXNone: Self = this.set("onOverflowXNone", js.undefined)
    
    @scala.inline
    def setOnOverflowY(value: () => Unit): Self = this.set("onOverflowY", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOverflowY: Self = this.set("onOverflowY", js.undefined)
    
    @scala.inline
    def setOnOverflowYNone(value: () => Unit): Self = this.set("onOverflowYNone", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOverflowYNone: Self = this.set("onOverflowYNone", js.undefined)
    
    @scala.inline
    def setOnScroll(value: () => Unit): Self = this.set("onScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollStart(value: () => Unit): Self = this.set("onScrollStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnScrollStart: Self = this.set("onScrollStart", js.undefined)
    
    @scala.inline
    def setOnSelectorChange(value: () => Unit): Self = this.set("onSelectorChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSelectorChange: Self = this.set("onSelectorChange", js.undefined)
    
    @scala.inline
    def setOnTotalScroll(value: () => Unit): Self = this.set("onTotalScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTotalScroll: Self = this.set("onTotalScroll", js.undefined)
    
    @scala.inline
    def setOnTotalScrollBack(value: () => Unit): Self = this.set("onTotalScrollBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTotalScrollBack: Self = this.set("onTotalScrollBack", js.undefined)
    
    @scala.inline
    def setOnTotalScrollBackOffset(value: Double): Self = this.set("onTotalScrollBackOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTotalScrollBackOffset: Self = this.set("onTotalScrollBackOffset", js.undefined)
    
    @scala.inline
    def setOnTotalScrollOffset(value: Double): Self = this.set("onTotalScrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTotalScrollOffset: Self = this.set("onTotalScrollOffset", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: () => Unit): Self = this.set("onUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setWhileScrolling(value: () => Unit): Self = this.set("whileScrolling", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteWhileScrolling: Self = this.set("whileScrolling", js.undefined)
  }
}
