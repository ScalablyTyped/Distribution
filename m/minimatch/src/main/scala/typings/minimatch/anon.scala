package typings.minimatch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.minimatch.distCjsAstMod.AST
import typings.minimatch.distCjsAstMod.ExtglobType
import typings.minimatch.minimatchBooleans.`false`
import typings.minimatch.mod.MMRegExp
import typings.minimatch.mod.MinimatchOptions
import typings.minimatch.mod.Minimatch_
import typings.minimatch.mod.Sep_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(p: String, pattern: String): Boolean = js.native
    def apply(p: String, pattern: String, options: MinimatchOptions): Boolean = js.native
    
    def braceExpand(pattern: String): js.Array[String] = js.native
    def braceExpand(pattern: String, options: MinimatchOptions): js.Array[String] = js.native
    
    def defaults(`def`: MinimatchOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof minimatch */ js.Any = js.native
    
    def escape(s: String): String = js.native
    def escape(s: String, param1: PickMinimatchOptionswindo): String = js.native
    
    def filter(pattern: String): js.Function1[/* p */ String, Boolean] = js.native
    def filter(pattern: String, options: MinimatchOptions): js.Function1[/* p */ String, Boolean] = js.native
    
    def makeRe(pattern: String): `false` | MMRegExp = js.native
    def makeRe(pattern: String, options: MinimatchOptions): `false` | MMRegExp = js.native
    
    def `match`(list: js.Array[String], pattern: String): js.Array[String] = js.native
    def `match`(list: js.Array[String], pattern: String, options: MinimatchOptions): js.Array[String] = js.native
    
    var sep: Sep_ = js.native
    
    def unescape(s: String): String = js.native
    def unescape(s: String, param1: PickMinimatchOptionswindo): String = js.native
  }
  
  /* Inlined std.Pick<minimatch.minimatch.MinimatchOptions, 'windowsPathsNoEscape'> */
  trait PickMinimatchOptionswindo extends StObject {
    
    var windowsPathsNoEscape: js.UndefOr[Boolean] = js.undefined
  }
  object PickMinimatchOptionswindo {
    
    inline def apply(): PickMinimatchOptionswindo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickMinimatchOptionswindo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickMinimatchOptionswindo] (val x: Self) extends AnyVal {
      
      inline def setWindowsPathsNoEscape(value: Boolean): Self = StObject.set(x, "windowsPathsNoEscape", value.asInstanceOf[js.Any])
      
      inline def setWindowsPathsNoEscapeUndefined: Self = StObject.set(x, "windowsPathsNoEscape", js.undefined)
    }
  }
  
  @js.native
  trait TypeofAST
    extends StObject
       with Instantiable0[AST]
       with Instantiable1[/* type */ ExtglobType, AST]
       with Instantiable2[(/* type */ ExtglobType) | (/* type */ Null), /* parent */ AST, AST]
       with Instantiable3[
          (/* type */ ExtglobType) | (/* type */ Null), 
          (/* parent */ AST) | (/* parent */ Unit), 
          /* options */ MinimatchOptions, 
          AST
        ] {
    
    def fromGlob(pattern: String): AST = js.native
    def fromGlob(pattern: String, options: MinimatchOptions): AST = js.native
  }
  
  @js.native
  trait TypeofMinimatch
    extends StObject
       with Instantiable1[/* pattern */ String, Minimatch_]
       with Instantiable2[/* pattern */ String, /* options */ MinimatchOptions, Minimatch_] {
    
    def defaults(`def`: MinimatchOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof Minimatch */ js.Any = js.native
  }
}
