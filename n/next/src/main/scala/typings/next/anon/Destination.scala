package typings.next.anon

import typings.next.nextBooleans.`false`
import typings.next.nextNumbers.`301`
import typings.next.nextNumbers.`302`
import typings.next.nextNumbers.`303`
import typings.next.nextNumbers.`307`
import typings.next.nextNumbers.`308`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destination
  extends typings.next.mod.Redirect {
  
  var basePath: js.UndefOr[`false`] = js.native
  
  var destination: String = js.native
  
  var statusCode: `301` | `302` | `303` | `307` | `308` = js.native
}
object Destination {
  
  @scala.inline
  def apply(destination: String, statusCode: `301` | `302` | `303` | `307` | `308`): Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: `301` | `302` | `303` | `307` | `308`): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePath(value: `false`): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
  }
}
