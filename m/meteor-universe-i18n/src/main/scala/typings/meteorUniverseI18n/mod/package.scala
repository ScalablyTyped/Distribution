package typings.meteorUniverseI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Translator = js.Function1[/* repeated */ js.Any, java.lang.String]
  
  type i18nLocaleEntry = js.Tuple7[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    scala.Boolean, 
    java.lang.String, 
    scala.Double, 
    (/* import warning: importer.ImportType#apply Failed type conversion: string[number] */ js.Any) | (js.Tuple2[scala.Double, scala.Double])
  ]
}
