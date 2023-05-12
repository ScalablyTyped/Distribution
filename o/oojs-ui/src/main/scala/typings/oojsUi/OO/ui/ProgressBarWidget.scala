package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.ProgressBarWidget.Props
import typings.oojsUi.OO.ui.ProgressBarWidget.Prototype
import typings.oojsUi.oojsUiBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Progress bars visually display the status of an operation, such as a download,
  * and can be either determinate or indeterminate:
  *
  * - **determinate** process bars show the percent of an operation that is complete.
  *
  * - **indeterminate** process bars use a visual display of motion to indicate that an operation
  *   is taking place. Because the extent of an indeterminate operation is unknown, the bar does
  *   not use percentages.
  *
  * The value of the `progress` configuration determines whether the bar is determinate
  * or indeterminate.
  *
  *     // Examples of determinate and indeterminate progress bars.
  *     var progressBar1 = new OO.ui.ProgressBarWidget( {
  *         progress: 33
  *     } );
  *     var progressBar2 = new OO.ui.ProgressBarWidget();
  *
  *     // Create a FieldsetLayout to layout progress bars.
  *     var fieldset = new OO.ui.FieldsetLayout;
  *     fieldset.addItems( [
  *         new OO.ui.FieldLayout( progressBar1, {
  *             label: 'Determinate',
  *             align: 'top'
  *         } ),
  *         new OO.ui.FieldLayout( progressBar2, {
  *             label: 'Indeterminate',
  *             align: 'top'
  *         } )
  *     ] );
  *     $( document.body ).append( fieldset.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ProgressBarWidget
  */
@js.native
trait ProgressBarWidget
  extends StObject
     with Props
     with Prototype
object ProgressBarWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.PendingElement.ConfigOptions {
    
    /**
      * The type of progress bar (determinate or indeterminate).
      * To create a determinate progress bar, specify a number that reflects the initial
      * percent complete.
      * By default, the progress bar is indeterminate.
      */
    var progress: js.UndefOr[Double | `false`] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setProgress(value: Double | `false`): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[ProgressBarWidget]
       with Instantiable1[/* config */ ConfigOptions, ProgressBarWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.PendingElement.Props
  object Props {
    
    inline def apply($element: JQuery[HTMLElement], $pending: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $pending = $pending.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.PendingElement.Prototype {
    
    /**
      * Get the percent of the progress that has been completed. Indeterminate progresses will
      * return `false`.
      *
      * @return Progress percent
      */
    def getProgress(): Double | `false` = js.native
    
    /**
      * Set the percent of the process completed or `false` for an indeterminate process.
      *
      * @param progress Progress percent or `false` for indeterminate
      */
    def setProgress(progress: Double): Unit = js.native
    @JSName("setProgress")
    def setProgress_false(progress: `false`): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.Widget.Static
}
