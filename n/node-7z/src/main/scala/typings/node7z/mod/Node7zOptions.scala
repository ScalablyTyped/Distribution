package typings.node7z.mod

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node7zOptions extends js.Object {
  
  /** Path to an other 7-Zip binary. Default: 7z */
  @JSName("$bin")
  var $bin: js.UndefOr[String] = js.native
  
  /** Some commands accepts more specific targets. See https://github.com/quentinrossetti/node-7z#extract for an example. */
  @JSName("$cherryPick")
  var $cherryPick: js.UndefOr[js.Array[String]] = js.native
  
  /** Attach an external child process to be parsed */
  @JSName("$childProcess")
  var $childProcess: js.UndefOr[ChildProcess] = js.native
  
  /** Create the stream but do not spawn child process */
  @JSName("$defer")
  var $defer: js.UndefOr[Boolean] = js.native
  
  /**
    * Progress percentage gets fired. Shortcut for { outputStreams: ['b1'] }
    * Use if you want access to the progress event. Has an impact on performances.
    */
  @JSName("$progress")
  var $progress: js.UndefOr[Boolean] = js.native
  
  /** Pass raw arguments to the child_process.spawn() command */
  @JSName("$raw")
  var $raw: js.UndefOr[js.Array[String]] = js.native
  
  /** Pass options to the child_process.spawn() command */
  @JSName("$spawnOptions")
  var $spawnOptions: js.UndefOr[js.Object] = js.native
}
object Node7zOptions {
  
  @scala.inline
  def apply(): Node7zOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node7zOptions]
  }
  
  @scala.inline
  implicit class Node7zOptionsOps[Self <: Node7zOptions] (val x: Self) extends AnyVal {
    
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
    def set$bin(value: String): Self = this.set("$bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bin: Self = this.set("$bin", js.undefined)
    
    @scala.inline
    def set$cherryPickVarargs(value: String*): Self = this.set("$cherryPick", js.Array(value :_*))
    
    @scala.inline
    def set$cherryPick(value: js.Array[String]): Self = this.set("$cherryPick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$cherryPick: Self = this.set("$cherryPick", js.undefined)
    
    @scala.inline
    def set$childProcess(value: ChildProcess): Self = this.set("$childProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$childProcess: Self = this.set("$childProcess", js.undefined)
    
    @scala.inline
    def set$defer(value: Boolean): Self = this.set("$defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$defer: Self = this.set("$defer", js.undefined)
    
    @scala.inline
    def set$progress(value: Boolean): Self = this.set("$progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$progress: Self = this.set("$progress", js.undefined)
    
    @scala.inline
    def set$rawVarargs(value: String*): Self = this.set("$raw", js.Array(value :_*))
    
    @scala.inline
    def set$raw(value: js.Array[String]): Self = this.set("$raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$raw: Self = this.set("$raw", js.undefined)
    
    @scala.inline
    def set$spawnOptions(value: js.Object): Self = this.set("$spawnOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$spawnOptions: Self = this.set("$spawnOptions", js.undefined)
  }
}
