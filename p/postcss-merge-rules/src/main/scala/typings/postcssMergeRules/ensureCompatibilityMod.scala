package typings.postcssMergeRules

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ensureCompatibilityMod {
  
  @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureCompatibility(selectors: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureCompatibility")(selectors.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def ensureCompatibility(selectors: js.Array[String], browsers: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureCompatibility")(selectors.asInstanceOf[js.Any], browsers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ensureCompatibility(selectors: js.Array[String], browsers: js.Array[String], compatibilityCache: Map[String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureCompatibility")(selectors.asInstanceOf[js.Any], browsers.asInstanceOf[js.Any], compatibilityCache.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ensureCompatibility(selectors: js.Array[String], browsers: Unit, compatibilityCache: Map[String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureCompatibility")(selectors.asInstanceOf[js.Any], browsers.asInstanceOf[js.Any], compatibilityCache.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def noVendor(selector: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("noVendor")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object pseudoElements {
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:default")
    @js.native
    def default: String = js.native
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.::after")
    @js.native
    def ColonAfter: String = js.native
    
    inline def ColonAfter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("::after")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.::before")
    @js.native
    def ColonBefore: String = js.native
    
    inline def ColonBefore_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("::before")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.::first-letter")
    @js.native
    def ColonFirstLetter: String = js.native
    
    inline def ColonFirstLetter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("::first-letter")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.::first-line")
    @js.native
    def ColonFirstLine: String = js.native
    
    inline def ColonFirstLine_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("::first-line")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:active")
    @js.native
    def active: String = js.native
    
    inline def active_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":active")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:after")
    @js.native
    def after: String = js.native
    
    inline def after_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":after")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:any-link")
    @js.native
    def anyLink: String = js.native
    
    inline def anyLink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":any-link")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.::backdrop")
    @js.native
    def backdrop: String = js.native
    
    inline def backdrop_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("::backdrop")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:before")
    @js.native
    def before: String = js.native
    
    inline def before_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":before")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:checked")
    @js.native
    def checked: String = js.native
    
    inline def checked_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":checked")(x.asInstanceOf[js.Any])
    
    inline def default_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":default")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:dir")
    @js.native
    def dir: String = js.native
    
    inline def dir_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":dir")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:disabled")
    @js.native
    def disabled: String = js.native
    
    inline def disabled_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":disabled")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:empty")
    @js.native
    def empty: String = js.native
    
    inline def empty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":empty")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:enabled")
    @js.native
    def enabled: String = js.native
    
    inline def enabled_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":enabled")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:first-child")
    @js.native
    def firstChild: String = js.native
    
    inline def firstChild_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":first-child")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:first-letter")
    @js.native
    def firstLetter: String = js.native
    
    inline def firstLetter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":first-letter")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:first-line")
    @js.native
    def firstLine: String = js.native
    
    inline def firstLine_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":first-line")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:first-of-type")
    @js.native
    def firstOfType: String = js.native
    
    inline def firstOfType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":first-of-type")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:focus")
    @js.native
    def focus: String = js.native
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:focus-visible")
    @js.native
    def focusVisible: String = js.native
    
    inline def focusVisible_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":focus-visible")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:focus-within")
    @js.native
    def focusWithin: String = js.native
    
    inline def focusWithin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":focus-within")(x.asInstanceOf[js.Any])
    
    inline def focus_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":focus")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:has")
    @js.native
    def has: String = js.native
    
    inline def has_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":has")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:hover")
    @js.native
    def hover: String = js.native
    
    inline def hover_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":hover")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:in-range")
    @js.native
    def inRange: String = js.native
    
    inline def inRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":in-range")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:indeterminate")
    @js.native
    def indeterminate: String = js.native
    
    inline def indeterminate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":indeterminate")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:invalid")
    @js.native
    def invalid: String = js.native
    
    inline def invalid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:is")
    @js.native
    def is: String = js.native
    
    inline def is_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":is")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:lang")
    @js.native
    def lang: String = js.native
    
    inline def lang_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":lang")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:last-child")
    @js.native
    def lastChild: String = js.native
    
    inline def lastChild_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":last-child")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:last-of-type")
    @js.native
    def lastOfType: String = js.native
    
    inline def lastOfType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":last-of-type")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:link")
    @js.native
    def link: String = js.native
    
    inline def link_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":link")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.::marker")
    @js.native
    def marker: String = js.native
    
    inline def marker_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("::marker")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:matches")
    @js.native
    def matches: String = js.native
    
    inline def matches_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":matches")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:not")
    @js.native
    def not: String = js.native
    
    inline def not_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":not")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:nth-child")
    @js.native
    def nthChild: String = js.native
    
    inline def nthChild_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":nth-child")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:nth-last-child")
    @js.native
    def nthLastChild: String = js.native
    
    inline def nthLastChild_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":nth-last-child")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:nth-last-of-type")
    @js.native
    def nthLastOfType: String = js.native
    
    inline def nthLastOfType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":nth-last-of-type")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:nth-of-type")
    @js.native
    def nthOfType: String = js.native
    
    inline def nthOfType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":nth-of-type")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:only-child")
    @js.native
    def onlyChild: String = js.native
    
    inline def onlyChild_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":only-child")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:only-of-type")
    @js.native
    def onlyOfType: String = js.native
    
    inline def onlyOfType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":only-of-type")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:optional")
    @js.native
    def optional: String = js.native
    
    inline def optional_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":optional")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:out-of-range")
    @js.native
    def outOfRange: String = js.native
    
    inline def outOfRange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":out-of-range")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.::placeholder")
    @js.native
    def placeholder: String = js.native
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:placeholder-shown")
    @js.native
    def placeholderShown: String = js.native
    
    inline def placeholderShown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":placeholder-shown")(x.asInstanceOf[js.Any])
    
    inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("::placeholder")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:required")
    @js.native
    def required: String = js.native
    
    inline def required_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":required")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:root")
    @js.native
    def root: String = js.native
    
    inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":root")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.::selection")
    @js.native
    def selection: String = js.native
    
    inline def selection_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("::selection")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:target")
    @js.native
    def target: String = js.native
    
    inline def target_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":target")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:valid")
    @js.native
    def valid: String = js.native
    
    inline def valid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":valid")(x.asInstanceOf[js.Any])
    
    @JSImport("postcss-merge-rules/types/lib/ensureCompatibility", "pseudoElements.:visited")
    @js.native
    def visited: String = js.native
    
    inline def visited_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(":visited")(x.asInstanceOf[js.Any])
  }
  
  inline def sameVendor(selectorsA: js.Array[String], selectorsB: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sameVendor")(selectorsA.asInstanceOf[js.Any], selectorsB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
