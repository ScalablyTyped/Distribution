package typings.mdastUtilPhrasing

import typings.unistUtilIs.mod.AssertPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-phrasing/lib", "phrasing")
  @js.native
  val phrasing: AssertPredicatePhrasing = js.native
  
  type AssertPredicatePhrasing = AssertPredicate[PhrasingContent]
  
  type PhrasingContent = typings.mdast.mod.PhrasingContent
}
