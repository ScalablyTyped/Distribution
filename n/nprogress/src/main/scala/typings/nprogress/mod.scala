package typings.nprogress

import org.scalablytyped.runtime.Shortcut
import typings.nprogress.anon.PartialNProgressOptions
import typings.nprogress.nprogressStrings.margin
import typings.nprogress.nprogressStrings.translate
import typings.nprogress.nprogressStrings.translate3d
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("nprogress", JSImport.Namespace)
  @js.native
  val ^ : NProgress = js.native
  
  @js.native
  trait NProgress extends StObject {
    
    def configure(options: PartialNProgressOptions): NProgress = js.native
    
    def done(): NProgress = js.native
    def done(force: Boolean): NProgress = js.native
    
    def getPositioningCSS(): translate3d | translate | margin = js.native
    
    def inc(): NProgress = js.native
    def inc(amount: Double): NProgress = js.native
    
    def isRendered(): Boolean = js.native
    
    def isStarted(): Boolean = js.native
    
    def remove(): Unit = js.native
    
    /* Internal */
    def render(): HTMLDivElement = js.native
    def render(fromStart: Boolean): HTMLDivElement = js.native
    
    def set(number: Double): NProgress = js.native
    
    var settings: NProgressOptions = js.native
    
    def start(): NProgress = js.native
    
    var status: Double | Null = js.native
    
    def trickle(): NProgress = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait NProgressOptions extends StObject {
    
    var barSelector: String = js.native
    
    var easing: String = js.native
    
    var minimum: Double = js.native
    
    var parent: String = js.native
    
    var positionUsing: String = js.native
    
    var showSpinner: Boolean = js.native
    
    var speed: Double = js.native
    
    var spinnerSelector: String = js.native
    
    var template: String = js.native
    
    var trickle: Boolean = js.native
    
    var trickleSpeed: Double = js.native
  }
  object NProgressOptions {
    
    @scala.inline
    def apply(
      barSelector: String,
      easing: String,
      minimum: Double,
      parent: String,
      positionUsing: String,
      showSpinner: Boolean,
      speed: Double,
      spinnerSelector: String,
      template: String,
      trickle: Boolean,
      trickleSpeed: Double
    ): NProgressOptions = {
      val __obj = js.Dynamic.literal(barSelector = barSelector.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], positionUsing = positionUsing.asInstanceOf[js.Any], showSpinner = showSpinner.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], spinnerSelector = spinnerSelector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], trickle = trickle.asInstanceOf[js.Any], trickleSpeed = trickleSpeed.asInstanceOf[js.Any])
      __obj.asInstanceOf[NProgressOptions]
    }
    
    @scala.inline
    implicit class NProgressOptionsMutableBuilder[Self <: NProgressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarSelector(value: String): Self = StObject.set(x, "barSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUsing(value: String): Self = StObject.set(x, "positionUsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSpinner(value: Boolean): Self = StObject.set(x, "showSpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerSelector(value: String): Self = StObject.set(x, "spinnerSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrickle(value: Boolean): Self = StObject.set(x, "trickle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrickleSpeed(value: Double): Self = StObject.set(x, "trickleSpeed", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = NProgress
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NProgress = ^
}
