package typings.nGram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("n-gram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bigram[T /* <: String | js.Array[Any] */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T : std.Array<string> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bigram")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T : std.Array<string> */ js.Any]
  inline def bigram[T /* <: String | js.Array[Any] */](value: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T : std.Array<string> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bigram")(value.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T : std.Array<string> */ js.Any]
  
  inline def nGram(n: Double): js.Function1[
    /* value */ js.UndefOr[String | js.Array[Any]], 
    /* import warning: importer.ImportType#apply Failed type conversion: string | std.Array<unknown> extends std.Array<any> ? string | std.Array<unknown> : std.Array<string> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("nGram")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* value */ js.UndefOr[String | js.Array[Any]], 
    /* import warning: importer.ImportType#apply Failed type conversion: string | std.Array<unknown> extends std.Array<any> ? string | std.Array<unknown> : std.Array<string> */ js.Any
  ]]
  
  inline def trigram[T /* <: String | js.Array[Any] */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T : std.Array<string> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("trigram")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T : std.Array<string> */ js.Any]
  inline def trigram[T /* <: String | js.Array[Any] */](value: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T : std.Array<string> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("trigram")(value.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T : std.Array<string> */ js.Any]
}
