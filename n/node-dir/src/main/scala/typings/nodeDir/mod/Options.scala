package typings.nodeDir.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  // control if done function called on error (defaults to true)
  var doneOnErr: js.UndefOr[Boolean] = js.native
  
  // file encoding (defaults to 'utf8')
  var encoding: js.UndefOr[String] = js.native
  
  // a regex pattern or array to specify filenames to ignore
  var exclude: js.UndefOr[RegExp | js.Array[String]] = js.native
  
  // a regex pattern or array to specify directories to ignore
  var excludeDir: js.UndefOr[RegExp | js.Array[String]] = js.native
  
  // a regex pattern or array to specify filenames to operate on
  var `match`: js.UndefOr[RegExp | js.Array[String]] = js.native
  
  // a regex pattern or array to specify directories to recurse
  var matchDir: js.UndefOr[RegExp | js.Array[String]] = js.native
  
  // whether to recurse subdirectories when reading files (defaults to true)
  var recursive: js.UndefOr[Boolean] = js.native
  
  // sort files in each directory in descending order
  var reverse: js.UndefOr[Boolean] = js.native
  
  // whether to aggregate only the base filename rather than the full filepath
  var shortName: js.UndefOr[Boolean] = js.native
  
  // sort files in each directory in ascending order (defaults to true)
  var sort: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDoneOnErr(value: Boolean): Self = this.set("doneOnErr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneOnErr: Self = this.set("doneOnErr", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: RegExp | js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExcludeDirVarargs(value: String*): Self = this.set("excludeDir", js.Array(value :_*))
    
    @scala.inline
    def setExcludeDir(value: RegExp | js.Array[String]): Self = this.set("excludeDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeDir: Self = this.set("excludeDir", js.undefined)
    
    @scala.inline
    def setMatchVarargs(value: String*): Self = this.set("match", js.Array(value :_*))
    
    @scala.inline
    def setMatch(value: RegExp | js.Array[String]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setMatchDirVarargs(value: String*): Self = this.set("matchDir", js.Array(value :_*))
    
    @scala.inline
    def setMatchDir(value: RegExp | js.Array[String]): Self = this.set("matchDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchDir: Self = this.set("matchDir", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setShortName(value: Boolean): Self = this.set("shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
