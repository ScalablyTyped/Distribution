package typings.nodelibFsWalk.anon

import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.nodelibFsScandir.anon.Typeoflstat
import typings.nodelibFsScandir.anon.Typeofreaddir
import typings.nodelibFsScandir.anon.Typeofstat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@nodelib/fs.scandir.@nodelib/fs.scandir.FileSystemAdapter> */
@js.native
trait PartialFileSystemAdapter extends js.Object {
  
  var lstat: js.UndefOr[Typeoflstat] = js.native
  
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
  
  var readdir: js.UndefOr[Typeofreaddir] = js.native
  
  var readdirSync: js.UndefOr[
    js.Function2[
      /* path */ PathLike, 
      /* options */ BaseEncodingOptionswithFiEncoding, 
      js.Array[Dirent]
    ]
  ] = js.native
  
  var stat: js.UndefOr[Typeofstat] = js.native
  
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
}
object PartialFileSystemAdapter {
  
  @scala.inline
  def apply(): PartialFileSystemAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFileSystemAdapter]
  }
  
  @scala.inline
  implicit class PartialFileSystemAdapterOps[Self <: PartialFileSystemAdapter] (val x: Self) extends AnyVal {
    
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
    def setLstat(value: Typeoflstat): Self = this.set("lstat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLstat: Self = this.set("lstat", js.undefined)
    
    @scala.inline
    def setLstatSync(value: /* path */ PathLike => Stats): Self = this.set("lstatSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLstatSync: Self = this.set("lstatSync", js.undefined)
    
    @scala.inline
    def setReaddir(value: Typeofreaddir): Self = this.set("readdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReaddir: Self = this.set("readdir", js.undefined)
    
    @scala.inline
    def setReaddirSync(value: (/* path */ PathLike, /* options */ BaseEncodingOptionswithFiEncoding) => js.Array[Dirent]): Self = this.set("readdirSync", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReaddirSync: Self = this.set("readdirSync", js.undefined)
    
    @scala.inline
    def setStat(value: Typeofstat): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStat: Self = this.set("stat", js.undefined)
    
    @scala.inline
    def setStatSync(value: /* path */ PathLike => Stats): Self = this.set("statSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStatSync: Self = this.set("statSync", js.undefined)
  }
}
