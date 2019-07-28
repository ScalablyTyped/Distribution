package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainsResult extends PaginatedResult {
  var Domains: js.Array[DomainBase]
}

object DomainsResult {
  @scala.inline
  def apply(Domains: js.Array[DomainBase], TotalCount: Double): DomainsResult = {
    val __obj = js.Dynamic.literal(Domains = Domains, TotalCount = TotalCount)
  
    __obj.asInstanceOf[DomainsResult]
  }
}

