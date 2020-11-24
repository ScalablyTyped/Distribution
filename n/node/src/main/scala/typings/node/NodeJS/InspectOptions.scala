package typings.node.NodeJS

import typings.node.nodeStrings.get
import typings.node.nodeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectOptions extends js.Object {
  
  var breakLength: js.UndefOr[Double] = js.native
  
  var colors: js.UndefOr[Boolean] = js.native
  
  /**
    * Setting this to `false` causes each object key
    * to be displayed on a new line. It will also add new lines to text that is
    * longer than `breakLength`. If set to a number, the most `n` inner elements
    * are united on a single line as long as all properties fit into
    * `breakLength`. Short array elements are also grouped together. Note that no
    * text will be reduced below 16 characters, no matter the `breakLength` size.
    * For more information, see the example below.
    * @default `true`
    */
  var compact: js.UndefOr[Boolean | Double] = js.native
  
  var customInspect: js.UndefOr[Boolean] = js.native
  
  /**
    * @default 2
    */
  var depth: js.UndefOr[Double | Null] = js.native
  
  /**
    * If set to `true`, getters are going to be
    * inspected as well. If set to `'get'` only getters without setter are going
    * to be inspected. If set to `'set'` only getters having a corresponding
    * setter are going to be inspected. This might cause side effects depending on
    * the getter function.
    * @default `false`
    */
  var getters: js.UndefOr[get | set | Boolean] = js.native
  
  var maxArrayLength: js.UndefOr[Double | Null] = js.native
  
  /**
    * Specifies the maximum number of characters to
    * include when formatting. Set to `null` or `Infinity` to show all elements.
    * Set to `0` or negative to show no characters.
    * @default Infinity
    */
  var maxStringLength: js.UndefOr[Double | Null] = js.native
  
  var showHidden: js.UndefOr[Boolean] = js.native
  
  var showProxy: js.UndefOr[Boolean] = js.native
  
  var sorted: js.UndefOr[Boolean | (js.Function2[/* a */ String, /* b */ String, Double])] = js.native
}
object InspectOptions {
  
  @scala.inline
  def apply(): InspectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectOptions]
  }
  
  @scala.inline
  implicit class InspectOptionsOps[Self <: InspectOptions] (val x: Self) extends AnyVal {
    
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
    def setBreakLength(value: Double): Self = this.set("breakLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakLength: Self = this.set("breakLength", js.undefined)
    
    @scala.inline
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean | Double): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setCustomInspect(value: Boolean): Self = this.set("customInspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomInspect: Self = this.set("customInspect", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setDepthNull: Self = this.set("depth", null)
    
    @scala.inline
    def setGetters(value: get | set | Boolean): Self = this.set("getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetters: Self = this.set("getters", js.undefined)
    
    @scala.inline
    def setMaxArrayLength(value: Double): Self = this.set("maxArrayLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxArrayLength: Self = this.set("maxArrayLength", js.undefined)
    
    @scala.inline
    def setMaxArrayLengthNull: Self = this.set("maxArrayLength", null)
    
    @scala.inline
    def setMaxStringLength(value: Double): Self = this.set("maxStringLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStringLength: Self = this.set("maxStringLength", js.undefined)
    
    @scala.inline
    def setMaxStringLengthNull: Self = this.set("maxStringLength", null)
    
    @scala.inline
    def setShowHidden(value: Boolean): Self = this.set("showHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHidden: Self = this.set("showHidden", js.undefined)
    
    @scala.inline
    def setShowProxy(value: Boolean): Self = this.set("showProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowProxy: Self = this.set("showProxy", js.undefined)
    
    @scala.inline
    def setSortedFunction2(value: (/* a */ String, /* b */ String) => Double): Self = this.set("sorted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSorted(value: Boolean | (js.Function2[/* a */ String, /* b */ String, Double])): Self = this.set("sorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorted: Self = this.set("sorted", js.undefined)
  }
}
