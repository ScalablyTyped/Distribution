package typings.minappEnv.global

import typings.minappEnv.Intl.Collator
import typings.minappEnv.Intl.CollatorOptions
import typings.minappEnv.Intl.DateTimeFormat
import typings.minappEnv.Intl.DateTimeFormatOptions
import typings.minappEnv.Intl.NumberFormat
import typings.minappEnv.Intl.NumberFormatOptions
import typings.minappEnv.Intl.ResolvedCollatorOptions
import typings.minappEnv.Intl.ResolvedNumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  object Collator {
    
    @scala.inline
    def apply(): typings.minappEnv.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.minappEnv.Intl.Collator]
    @scala.inline
    def apply(locales: java.lang.String): typings.minappEnv.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Intl.Collator]
    @scala.inline
    def apply(locales: java.lang.String, options: CollatorOptions): typings.minappEnv.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Intl.Collator]
    @scala.inline
    def apply(locales: Unit, options: CollatorOptions): typings.minappEnv.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Intl.Collator]
    @scala.inline
    def apply(locales: typings.minappEnv.Array[java.lang.String]): typings.minappEnv.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Intl.Collator]
    @scala.inline
    def apply(locales: typings.minappEnv.Array[java.lang.String], options: CollatorOptions): typings.minappEnv.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Intl.Collator]
    
    @JSGlobal("Intl.Collator")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String): typings.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): typings.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: typings.minappEnv.Array[java.lang.String]): typings.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: typings.minappEnv.Array[java.lang.String], options: CollatorOptions): typings.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Collator")
  @js.native
  class CollatorCls ()
    extends StObject
       with Collator {
    def this(locales: java.lang.String) = this()
    def this(locales: typings.minappEnv.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: CollatorOptions) = this()
    def this(locales: Unit, options: CollatorOptions) = this()
    def this(locales: typings.minappEnv.Array[java.lang.String], options: CollatorOptions) = this()
    
    /* CompleteClass */
    override def compare(x: java.lang.String, y: java.lang.String): Double = js.native
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedCollatorOptions = js.native
  }
  
  object DateTimeFormat {
    
    @scala.inline
    def apply(): typings.minappEnv.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.minappEnv.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: java.lang.String): typings.minappEnv.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: java.lang.String, options: DateTimeFormatOptions): typings.minappEnv.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: Unit, options: DateTimeFormatOptions): typings.minappEnv.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: typings.minappEnv.Array[java.lang.String]): typings.minappEnv.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: typings.minappEnv.Array[java.lang.String], options: DateTimeFormatOptions): typings.minappEnv.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Intl.DateTimeFormat]
    
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String): typings.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): typings.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: typings.minappEnv.Array[java.lang.String]): typings.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: typings.minappEnv.Array[java.lang.String], options: DateTimeFormatOptions): typings.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DateTimeFormat")
  @js.native
  class DateTimeFormatCls ()
    extends StObject
       with DateTimeFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: typings.minappEnv.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
    def this(locales: Unit, options: DateTimeFormatOptions) = this()
    def this(locales: typings.minappEnv.Array[java.lang.String], options: DateTimeFormatOptions) = this()
  }
  
  object NumberFormat {
    
    @scala.inline
    def apply(): typings.minappEnv.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.minappEnv.Intl.NumberFormat]
    @scala.inline
    def apply(locales: java.lang.String): typings.minappEnv.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Intl.NumberFormat]
    @scala.inline
    def apply(locales: java.lang.String, options: NumberFormatOptions): typings.minappEnv.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Intl.NumberFormat]
    @scala.inline
    def apply(locales: Unit, options: NumberFormatOptions): typings.minappEnv.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Intl.NumberFormat]
    @scala.inline
    def apply(locales: typings.minappEnv.Array[java.lang.String]): typings.minappEnv.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Intl.NumberFormat]
    @scala.inline
    def apply(locales: typings.minappEnv.Array[java.lang.String], options: NumberFormatOptions): typings.minappEnv.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Intl.NumberFormat]
    
    @JSGlobal("Intl.NumberFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String): typings.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): typings.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: typings.minappEnv.Array[java.lang.String]): typings.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: typings.minappEnv.Array[java.lang.String], options: NumberFormatOptions): typings.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minappEnv.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.NumberFormat")
  @js.native
  class NumberFormatCls ()
    extends StObject
       with NumberFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: typings.minappEnv.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: NumberFormatOptions) = this()
    def this(locales: Unit, options: NumberFormatOptions) = this()
    def this(locales: typings.minappEnv.Array[java.lang.String], options: NumberFormatOptions) = this()
    
    /* CompleteClass */
    override def format(value: Double): java.lang.String = js.native
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedNumberFormatOptions = js.native
  }
}
