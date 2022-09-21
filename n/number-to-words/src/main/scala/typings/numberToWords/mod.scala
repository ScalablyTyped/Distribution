package typings.numberToWords

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("number-to-words", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toOrdinal(number: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toOrdinal")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toOrdinal(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toOrdinal")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toWords(number: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toWords")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toWords(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toWords")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toWordsOrdinal(number: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toWordsOrdinal")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toWordsOrdinal(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toWordsOrdinal")(number.asInstanceOf[js.Any]).asInstanceOf[String]
}
