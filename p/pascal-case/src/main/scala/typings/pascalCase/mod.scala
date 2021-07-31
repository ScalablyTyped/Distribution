package typings.pascalCase

import typings.noCase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pascal-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pascalCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def pascalCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pascalCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pascalCaseTransform(input: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pascalCaseTransform")(input.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pascalCaseTransformMerge(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalCaseTransformMerge")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
