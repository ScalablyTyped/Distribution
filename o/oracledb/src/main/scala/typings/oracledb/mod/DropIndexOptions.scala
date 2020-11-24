package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options which may be passed to SODA collection.dropIndex().
  */
@js.native
trait DropIndexOptions extends js.Object {
  
  /**
    * Setting force to true forces dropping of a JSON Search index or Spatial index if the
    * underlying Oracle Database domain index does not permit normal dropping.
    *
    * @see https://www.oracle.com/pls/topic/lookup?ctx=dblatest&id=GUID-F60F75DF-2866-4F93-BB7F-8FCE64BF67B6
    */
  var force: js.UndefOr[Boolean] = js.native
}
object DropIndexOptions {
  
  @scala.inline
  def apply(): DropIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropIndexOptions]
  }
  
  @scala.inline
  implicit class DropIndexOptionsOps[Self <: DropIndexOptions] (val x: Self) extends AnyVal {
    
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
  }
}
