package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SenderSignaturesResults extends PaginatedResult {
  var SenderSignatures: js.Array[SenderSignatureBase]
}

object SenderSignaturesResults {
  @scala.inline
  def apply(SenderSignatures: js.Array[SenderSignatureBase], TotalCount: scala.Double): SenderSignaturesResults = {
    val __obj = js.Dynamic.literal(SenderSignatures = SenderSignatures, TotalCount = TotalCount)
  
    __obj.asInstanceOf[SenderSignaturesResults]
  }
}

