package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.mixin.FlaggedElement.Props
import typings.oojsUi.OO.ui.mixin.FlaggedElement.Prototype
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The FlaggedElement class is an attribute mixin, meaning that it is used to add
  * additional functionality to an element created by another class. The class provides
  * a ‘flags’ property assigned the name (or an array of names) of styling flags,
  * which are used to customize the look and feel of a widget to better describe its
  * importance and functionality.
  *
  * The library currently contains the following styling flags for general use:
  *
  * - **progressive**: Progressive styling is applied to convey that the widget will move the user
  *   forward in a process.
  * - **destructive**: Destructive styling is applied to convey that the widget will remove
  *   something.
  *
  * The flags affect the appearance of the buttons:
  *
  *     // FlaggedElement is mixed into ButtonWidget to provide styling flags
  *     var button1 = new OO.ui.ButtonWidget( {
  *             label: 'Progressive',
  *             flags: 'progressive'
  *         } ),
  *         button2 = new OO.ui.ButtonWidget( {
  *             label: 'Destructive',
  *             flags: 'destructive'
  *         } );
  *     $( document.body ).append( button1.$element, button2.$element );
  *
  * {@link OO.ui.ActionWidget ActionWidgets}, which are a special kind of button that execute an
  * action, use these flags: **primary** and **safe**.
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Elements/Flagged)
  * for more information.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.FlaggedElement
  */
@js.native
trait FlaggedElement
  extends StObject
     with Props
     with Prototype
object FlaggedElement {
  
  trait ConfigOptions extends StObject {
    
    /**
      * The flagged element. By default,
      * the flagged functionality is applied to the element created by the class ($element).
      * If a different element is specified, the flagged functionality will be applied to it
      *  instead.
      */
    @JSName("$flagged")
    var $flagged: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * The name or names of the flags (e.g., 'progressive' or 'primary')
      * to apply.
      * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Elements/Flagged)
      * for more information about available flags.
      */
    var flags: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$flagged(value: JQuery[HTMLElement]): Self = StObject.set(x, "$flagged", value.asInstanceOf[js.Any])
      
      inline def set$flaggedUndefined: Self = StObject.set(x, "$flagged", js.undefined)
      
      inline def setFlags(value: String | js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[FlaggedElement]
       with Instantiable1[/* config */ ConfigOptions, FlaggedElement] {
    
    var static: Static = js.native
  }
  
  trait EventMap extends StObject {
    
    var flag: js.Array[/* changes */ Record[String, Boolean]]
  }
  object EventMap {
    
    inline def apply(flag: js.Array[/* changes */ Record[String, Boolean]]): EventMap = {
      val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setFlag(value: js.Array[/* changes */ Record[String, Boolean]]): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagVarargs(value: (/* changes */ Record[String, Boolean])*): Self = StObject.set(x, "flag", js.Array(value*))
    }
  }
  
  trait Props extends StObject {
    
    @JSName("$flagged")
    var $flagged: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($flagged: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($flagged = $flagged.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$flagged(value: JQuery[HTMLElement]): Self = StObject.set(x, "$flagged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Clear all flags.
      *
      * @return The element, for chaining
      */
    def clearFlags(): this.type = js.native
    
    /**
      * Get the names of all flags set.
      *
      * @return Flag names
      */
    def getFlags(): js.Array[String] = js.native
    
    /**
      * Check if the specified flag is set.
      *
      * @param flag Name of flag
      * @return The flag is set
      */
    def hasFlag(flag: String): Boolean = js.native
    
    /**
      * Set the flagged element.
      *
      * This method is used to retarget a flagged mixin so that its functionality applies to
      * the specified element.
      * If an element is already set, the method will remove the mixin’s effect on that element.
      *
      * @param $flagged Element that should be flagged
      */
    def setFlaggedElement($flagged: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Add one or more flags.
      *
      * @param flags A flag name, an array of flag names,
      *  or an object keyed by flag name with a boolean value that indicates whether the flag
      *  should be added (`true`) or removed (`false`).
      * @return The element, for chaining
      */
    def setFlags(flags: String): this.type = js.native
    def setFlags(flags: js.Array[String]): this.type = js.native
    def setFlags(flags: Record[String, Boolean]): this.type = js.native
  }
  
  trait Static extends StObject {
    
    var flags: String | js.Array[String] | (Record[String, Boolean])
  }
  object Static {
    
    inline def apply(flags: String | js.Array[String] | (Record[String, Boolean])): Static = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setFlags(value: String | js.Array[String] | (Record[String, Boolean])): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
    }
  }
}
