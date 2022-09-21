package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "Parser")
@js.native
open class Parser[Q /* <: BaseQuad */] () extends StObject {
  def this(options: ParserOptions) = this()
  
  def parse(input: String): js.Array[Q] = js.native
  def parse(input: String, callback: Null, prefixCallback: PrefixCallback): js.Array[Q] = js.native
  def parse(input: String, callback: Unit, prefixCallback: PrefixCallback): js.Array[Q] = js.native
  def parse(input: String, callback: ParseCallback[Q]): Unit = js.native
  def parse(input: String, callback: ParseCallback[Q], prefixCallback: PrefixCallback): Unit = js.native
}
