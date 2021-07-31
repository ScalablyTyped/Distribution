package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseTokenizer
  extends StObject
     with Tokenizer {
  
  def tokenize(text: String, preserveApostrophy: Boolean): js.Array[String] = js.native
}
