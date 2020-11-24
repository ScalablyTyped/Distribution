package typings.ncp.anon

import typings.ncp.mod.File
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.PathLike
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ncp.ncp.Options & {  errs :undefined} */
@js.native
trait Optionserrsundefined extends js.Object {
  
  var clobber: js.UndefOr[Boolean] = js.native
  
  var dereference: js.UndefOr[Boolean] = js.native
  
  var errs: js.UndefOr[PathLike] with js.UndefOr[scala.Nothing] = js.native
  
  var filter: js.UndefOr[RegExp | (js.Function1[/* filename */ String, Boolean])] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var stopOnErr: js.UndefOr[Boolean] = js.native
  
  var transform: js.UndefOr[
    js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
  ] = js.native
}
object Optionserrsundefined {
  
  @scala.inline
  def apply(errs: js.UndefOr[PathLike] with js.UndefOr[scala.Nothing]): Optionserrsundefined = {
    val __obj = js.Dynamic.literal(errs = errs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionserrsundefined]
  }
  
  @scala.inline
  implicit class OptionserrsundefinedOps[Self <: Optionserrsundefined] (val x: Self) extends AnyVal {
    
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
    def setErrs(value: js.UndefOr[PathLike] with js.UndefOr[scala.Nothing]): Self = this.set("errs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClobber(value: Boolean): Self = this.set("clobber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClobber: Self = this.set("clobber", js.undefined)
    
    @scala.inline
    def setDereference(value: Boolean): Self = this.set("dereference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDereference: Self = this.set("dereference", js.undefined)
    
    @scala.inline
    def setFilterFunction1(value: /* filename */ String => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilter(value: RegExp | (js.Function1[/* filename */ String, Boolean])): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setStopOnErr(value: Boolean): Self = this.set("stopOnErr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOnErr: Self = this.set("stopOnErr", js.undefined)
    
    @scala.inline
    def setTransform(value: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit): Self = this.set("transform", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
