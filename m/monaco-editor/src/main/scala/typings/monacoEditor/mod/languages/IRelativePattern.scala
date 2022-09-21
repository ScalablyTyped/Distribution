package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRelativePattern extends StObject {
  
  /**
    * A base file path to which this pattern will be matched against relatively.
    */
  val base: String
  
  /**
    * A file glob pattern like `*.{ts,js}` that will be matched on file paths
    * relative to the base path.
    *
    * Example: Given a base of `/home/work/folder` and a file path of `/home/work/folder/index.js`,
    * the file glob pattern will match on `index.js`.
    */
  val pattern: String
}
object IRelativePattern {
  
  inline def apply(base: String, pattern: String): IRelativePattern = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRelativePattern]
  }
  
  extension [Self <: IRelativePattern](x: Self) {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
