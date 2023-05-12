package typings.minimatch

import typings.minimatch.anon.Call
import typings.minimatch.anon.PickMinimatchOptionswindo
import typings.minimatch.anon.TypeofAST
import typings.minimatch.anon.TypeofMinimatch
import typings.minimatch.distCjsAstMod.ExtglobType
import typings.minimatch.minimatchBooleans.`false`
import typings.minimatch.minimatchStrings.Slash
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minimatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("minimatch", "AST")
  @js.native
  open class AST ()
    extends typings.minimatch.distCjsAstMod.AST {
    def this(`type`: ExtglobType) = this()
    def this(`type`: Null, parent: typings.minimatch.distCjsAstMod.AST) = this()
    def this(`type`: ExtglobType, parent: typings.minimatch.distCjsAstMod.AST) = this()
    def this(`type`: Null, parent: Unit, options: MinimatchOptions) = this()
    def this(`type`: Null, parent: typings.minimatch.distCjsAstMod.AST, options: MinimatchOptions) = this()
    def this(`type`: ExtglobType, parent: Unit, options: MinimatchOptions) = this()
    def this(`type`: ExtglobType, parent: typings.minimatch.distCjsAstMod.AST, options: MinimatchOptions) = this()
  }
  /* static members */
  object AST {
    
    @JSImport("minimatch", "AST")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromGlob(pattern: String): typings.minimatch.distCjsAstMod.AST = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGlob")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.minimatch.distCjsAstMod.AST]
    inline def fromGlob(pattern: String, options: MinimatchOptions): typings.minimatch.distCjsAstMod.AST = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGlob")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.minimatch.distCjsAstMod.AST]
  }
  
  @JSImport("minimatch", "GLOBSTAR")
  @js.native
  val GLOBSTAR: js.Symbol = js.native
  
  @JSImport("minimatch", "Minimatch")
  @js.native
  open class Minimatch_ protected () extends StObject {
    def this(pattern: String) = this()
    def this(pattern: String, options: MinimatchOptions) = this()
    
    def adjascentGlobstarOptimize(globParts: js.Array[js.Array[String]]): js.Array[js.Array[String]] = js.native
    
    def braceExpand(): js.Array[String] = js.native
    
    var comment: Boolean = js.native
    
    def debug(_underscore: Any*): Unit = js.native
    
    var empty: Boolean = js.native
    
    def firstPhasePreProcess(globParts: js.Array[js.Array[String]]): js.Array[js.Array[String]] = js.native
    
    var globParts: js.Array[js.Array[String]] = js.native
    
    var globSet: js.Array[String] = js.native
    
    def hasMagic(): Boolean = js.native
    
    var isWindows: Boolean = js.native
    
    def levelOneOptimize(globParts: js.Array[js.Array[String]]): js.Array[js.Array[String]] = js.native
    
    def levelTwoFileOptimize(parts: String): js.Array[String] = js.native
    def levelTwoFileOptimize(parts: js.Array[String]): js.Array[String] = js.native
    
    def make(): Unit = js.native
    
    def makeRe(): `false` | MMRegExp = js.native
    
    def `match`(f: String): Boolean = js.native
    def `match`(f: String, partial: Boolean): Boolean = js.native
    
    def matchOne(file: js.Array[String], pattern: js.Array[ParseReturn]): Boolean = js.native
    def matchOne(file: js.Array[String], pattern: js.Array[ParseReturn], partial: Boolean): Boolean = js.native
    
    var negate: Boolean = js.native
    
    var nocase: Boolean = js.native
    
    var nonegate: Boolean = js.native
    
    var options: MinimatchOptions = js.native
    
    def parse(pattern: String): ParseReturn = js.native
    
    def parseNegate(): Unit = js.native
    
    var partial: Boolean = js.native
    
    def partsMatch(a: js.Array[String], b: js.Array[String]): `false` | js.Array[String] = js.native
    def partsMatch(a: js.Array[String], b: js.Array[String], emptyGSMatch: Boolean): `false` | js.Array[String] = js.native
    
    var pattern: String = js.native
    
    var platform: Platform = js.native
    
    def preprocess(globParts: js.Array[js.Array[String]]): js.Array[js.Array[String]] = js.native
    
    var preserveMultipleSlashes: Boolean = js.native
    
    var regexp: `false` | Null | MMRegExp = js.native
    
    def secondPhasePreProcess(globParts: js.Array[js.Array[String]]): js.Array[js.Array[String]] = js.native
    
    var set: js.Array[js.Array[ParseReturnFiltered]] = js.native
    
    def slashSplit(p: String): js.Array[String] = js.native
    
    var windowsNoMagicRoot: Boolean = js.native
    
    var windowsPathsNoEscape: Boolean = js.native
  }
  /* static members */
  object Minimatch_ {
    
    @JSImport("minimatch", "Minimatch")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaults(`def`: MinimatchOptions): TypeofMinimatch = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(`def`.asInstanceOf[js.Any]).asInstanceOf[TypeofMinimatch]
  }
  
  inline def braceExpand(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("braceExpand")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def braceExpand(pattern: String, options: MinimatchOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("braceExpand")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def defaults(`def`: MinimatchOptions): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(`def`.asInstanceOf[js.Any]).asInstanceOf[Call]
  
  inline def escape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def escape(s: String, param1: PickMinimatchOptionswindo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def filter(pattern: String): js.Function1[/* p */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* p */ String, Boolean]]
  inline def filter(pattern: String, options: MinimatchOptions): js.Function1[/* p */ String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* p */ String, Boolean]]
  
  inline def makeRe(pattern: String): `false` | MMRegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any]).asInstanceOf[`false` | MMRegExp]
  inline def makeRe(pattern: String, options: MinimatchOptions): `false` | MMRegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[`false` | MMRegExp]
  
  inline def `match`(list: js.Array[String], pattern: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(list.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def `match`(list: js.Array[String], pattern: String, options: MinimatchOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(list.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  object minimatch {
    
    inline def apply(p: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(p.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(p: String, pattern: String, options: MinimatchOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(p.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("minimatch", "minimatch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("minimatch", "minimatch.AST")
    @js.native
    def AST: TypeofAST = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("minimatch", "minimatch.AST")
    @js.native
    open class ASTCls ()
      extends typings.minimatch.distCjsAstMod.AST {
      def this(`type`: ExtglobType) = this()
      def this(`type`: Null, parent: typings.minimatch.distCjsAstMod.AST) = this()
      def this(`type`: ExtglobType, parent: typings.minimatch.distCjsAstMod.AST) = this()
      def this(`type`: Null, parent: Unit, options: MinimatchOptions) = this()
      def this(`type`: Null, parent: typings.minimatch.distCjsAstMod.AST, options: MinimatchOptions) = this()
      def this(`type`: ExtglobType, parent: Unit, options: MinimatchOptions) = this()
      def this(`type`: ExtglobType, parent: typings.minimatch.distCjsAstMod.AST, options: MinimatchOptions) = this()
    }
    
    inline def AST_=(x: TypeofAST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AST")(x.asInstanceOf[js.Any])
    
    @JSImport("minimatch", "minimatch.GLOBSTAR")
    @js.native
    def GLOBSTAR: js.Symbol = js.native
    inline def GLOBSTAR_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GLOBSTAR")(x.asInstanceOf[js.Any])
    
    @JSImport("minimatch", "minimatch.Minimatch")
    @js.native
    def Minimatch: TypeofMinimatch = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("minimatch", "minimatch.Minimatch")
    @js.native
    open class MinimatchCls protected () extends Minimatch_ {
      def this(pattern: String) = this()
      def this(pattern: String, options: MinimatchOptions) = this()
    }
    
    inline def Minimatch_=(x: TypeofMinimatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minimatch")(x.asInstanceOf[js.Any])
    
    inline def braceExpand(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("braceExpand")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def braceExpand(pattern: String, options: MinimatchOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("braceExpand")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def defaults(`def`: MinimatchOptions): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(`def`.asInstanceOf[js.Any]).asInstanceOf[Call]
    
    inline def escape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def escape(s: String, param1: PickMinimatchOptionswindo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def filter(pattern: String): js.Function1[/* p */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* p */ String, Boolean]]
    inline def filter(pattern: String, options: MinimatchOptions): js.Function1[/* p */ String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* p */ String, Boolean]]
    
    inline def makeRe(pattern: String): `false` | MMRegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any]).asInstanceOf[`false` | MMRegExp]
    inline def makeRe(pattern: String, options: MinimatchOptions): `false` | MMRegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[`false` | MMRegExp]
    
    inline def `match`(list: js.Array[String], pattern: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(list.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def `match`(list: js.Array[String], pattern: String, options: MinimatchOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(list.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    @JSImport("minimatch", "minimatch.sep")
    @js.native
    def sep: Sep_ = js.native
    inline def sep_=(x: Sep_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
    
    inline def unescape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unescape(s: String, param1: PickMinimatchOptionswindo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(s.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("minimatch", "sep")
  @js.native
  val sep: Sep_ = js.native
  
  inline def unescape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unescape(s: String, param1: PickMinimatchOptionswindo): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(s.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait MMRegExp
    extends StObject
       with RegExp {
    
    var _glob: js.UndefOr[String] = js.native
    
    var _src: js.UndefOr[String] = js.native
  }
  
  trait MinimatchOptions extends StObject {
    
    var allowWindowsEscape: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var flipNegate: js.UndefOr[Boolean] = js.undefined
    
    var magicalBraces: js.UndefOr[Boolean] = js.undefined
    
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    var nocaseMagicOnly: js.UndefOr[Boolean] = js.undefined
    
    var nocomment: js.UndefOr[Boolean] = js.undefined
    
    var noext: js.UndefOr[Boolean] = js.undefined
    
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    var nonull: js.UndefOr[Boolean] = js.undefined
    
    var optimizationLevel: js.UndefOr[Double] = js.undefined
    
    var partial: js.UndefOr[Boolean] = js.undefined
    
    var platform: js.UndefOr[Platform] = js.undefined
    
    var preserveMultipleSlashes: js.UndefOr[Boolean] = js.undefined
    
    var windowsNoMagicRoot: js.UndefOr[Boolean] = js.undefined
    
    var windowsPathsNoEscape: js.UndefOr[Boolean] = js.undefined
  }
  object MinimatchOptions {
    
    inline def apply(): MinimatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinimatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinimatchOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowWindowsEscape(value: Boolean): Self = StObject.set(x, "allowWindowsEscape", value.asInstanceOf[js.Any])
      
      inline def setAllowWindowsEscapeUndefined: Self = StObject.set(x, "allowWindowsEscape", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setFlipNegate(value: Boolean): Self = StObject.set(x, "flipNegate", value.asInstanceOf[js.Any])
      
      inline def setFlipNegateUndefined: Self = StObject.set(x, "flipNegate", js.undefined)
      
      inline def setMagicalBraces(value: Boolean): Self = StObject.set(x, "magicalBraces", value.asInstanceOf[js.Any])
      
      inline def setMagicalBracesUndefined: Self = StObject.set(x, "magicalBraces", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseMagicOnly(value: Boolean): Self = StObject.set(x, "nocaseMagicOnly", value.asInstanceOf[js.Any])
      
      inline def setNocaseMagicOnlyUndefined: Self = StObject.set(x, "nocaseMagicOnly", js.undefined)
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNocomment(value: Boolean): Self = StObject.set(x, "nocomment", value.asInstanceOf[js.Any])
      
      inline def setNocommentUndefined: Self = StObject.set(x, "nocomment", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      inline def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      inline def setNonull(value: Boolean): Self = StObject.set(x, "nonull", value.asInstanceOf[js.Any])
      
      inline def setNonullUndefined: Self = StObject.set(x, "nonull", js.undefined)
      
      inline def setOptimizationLevel(value: Double): Self = StObject.set(x, "optimizationLevel", value.asInstanceOf[js.Any])
      
      inline def setOptimizationLevelUndefined: Self = StObject.set(x, "optimizationLevel", js.undefined)
      
      inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPreserveMultipleSlashes(value: Boolean): Self = StObject.set(x, "preserveMultipleSlashes", value.asInstanceOf[js.Any])
      
      inline def setPreserveMultipleSlashesUndefined: Self = StObject.set(x, "preserveMultipleSlashes", js.undefined)
      
      inline def setWindowsNoMagicRoot(value: Boolean): Self = StObject.set(x, "windowsNoMagicRoot", value.asInstanceOf[js.Any])
      
      inline def setWindowsNoMagicRootUndefined: Self = StObject.set(x, "windowsNoMagicRoot", js.undefined)
      
      inline def setWindowsPathsNoEscape(value: Boolean): Self = StObject.set(x, "windowsPathsNoEscape", value.asInstanceOf[js.Any])
      
      inline def setWindowsPathsNoEscapeUndefined: Self = StObject.set(x, "windowsPathsNoEscape", js.undefined)
    }
  }
  
  type ParseReturn = ParseReturnFiltered | `false`
  
  type ParseReturnFiltered = String | MMRegExp | js.Symbol
  
  /* Rewritten from type alias, can be one of: 
    - typings.minimatch.minimatchStrings.aix
    - typings.minimatch.minimatchStrings.android
    - typings.minimatch.minimatchStrings.darwin
    - typings.minimatch.minimatchStrings.freebsd
    - typings.minimatch.minimatchStrings.haiku
    - typings.minimatch.minimatchStrings.linux
    - typings.minimatch.minimatchStrings.openbsd
    - typings.minimatch.minimatchStrings.sunos
    - typings.minimatch.minimatchStrings.win32
    - typings.minimatch.minimatchStrings.cygwin
    - typings.minimatch.minimatchStrings.netbsd
  */
  trait Platform extends StObject
  object Platform {
    
    inline def aix: typings.minimatch.minimatchStrings.aix = "aix".asInstanceOf[typings.minimatch.minimatchStrings.aix]
    
    inline def android: typings.minimatch.minimatchStrings.android = "android".asInstanceOf[typings.minimatch.minimatchStrings.android]
    
    inline def cygwin: typings.minimatch.minimatchStrings.cygwin = "cygwin".asInstanceOf[typings.minimatch.minimatchStrings.cygwin]
    
    inline def darwin: typings.minimatch.minimatchStrings.darwin = "darwin".asInstanceOf[typings.minimatch.minimatchStrings.darwin]
    
    inline def freebsd: typings.minimatch.minimatchStrings.freebsd = "freebsd".asInstanceOf[typings.minimatch.minimatchStrings.freebsd]
    
    inline def haiku: typings.minimatch.minimatchStrings.haiku = "haiku".asInstanceOf[typings.minimatch.minimatchStrings.haiku]
    
    inline def linux: typings.minimatch.minimatchStrings.linux = "linux".asInstanceOf[typings.minimatch.minimatchStrings.linux]
    
    inline def netbsd: typings.minimatch.minimatchStrings.netbsd = "netbsd".asInstanceOf[typings.minimatch.minimatchStrings.netbsd]
    
    inline def openbsd: typings.minimatch.minimatchStrings.openbsd = "openbsd".asInstanceOf[typings.minimatch.minimatchStrings.openbsd]
    
    inline def sunos: typings.minimatch.minimatchStrings.sunos = "sunos".asInstanceOf[typings.minimatch.minimatchStrings.sunos]
    
    inline def win32: typings.minimatch.minimatchStrings.win32 = "win32".asInstanceOf[typings.minimatch.minimatchStrings.win32]
  }
  
  object Sep_ {
    
    inline def Backslash: /* \ */ String = "\\".asInstanceOf[/* \ */ String]
    
    inline def Slash: typings.minimatch.minimatchStrings.Slash = "/".asInstanceOf[typings.minimatch.minimatchStrings.Slash]
  }
  type Sep_ = (/* \ */ String) | Slash
}
