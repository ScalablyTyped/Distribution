package typings.pascalCase

import typings.noCase.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pascal-case", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def pascalCase(input: String): String = js.native
  def pascalCase(input: String, options: Options): String = js.native
  
  def pascalCaseTransform(input: String, index: Double): String = js.native
  
  def pascalCaseTransformMerge(input: String): String = js.native
}
