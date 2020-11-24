package typings.parseGlob.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Braces extends js.Object {
  
  /**
    * True if it has braces ({1..2} or .{txt,md}).
    */
  var braces: Boolean = js.native
  
  /**
    * True if it has POSIX brackets ([[:alpha:]]).
    */
  var brackets: Boolean = js.native
  
  /**
    * True if the pattern should match dot-directories (like .git).
    */
  var dotdir: Boolean = js.native
  
  /**
    * True if the pattern should match dotfiles.
    */
  var dotfile: Boolean = js.native
  
  /**
    * True if it has extglobs (@(foo|bar)).
    */
  var extglob: Boolean = js.native
  
  /**
    * True if the pattern actually is a glob pattern.
    */
  var glob: Boolean = js.native
  
  /**
    * True if the pattern has a globstar (double star, **).
    */
  var globstar: Boolean = js.native
  
  /**
    * True if it's a negation pattern (!/foo.js).
    */
  var negated: Boolean = js.native
}
object Braces {
  
  @scala.inline
  def apply(
    braces: Boolean,
    brackets: Boolean,
    dotdir: Boolean,
    dotfile: Boolean,
    extglob: Boolean,
    glob: Boolean,
    globstar: Boolean,
    negated: Boolean
  ): Braces = {
    val __obj = js.Dynamic.literal(braces = braces.asInstanceOf[js.Any], brackets = brackets.asInstanceOf[js.Any], dotdir = dotdir.asInstanceOf[js.Any], dotfile = dotfile.asInstanceOf[js.Any], extglob = extglob.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Braces]
  }
  
  @scala.inline
  implicit class BracesOps[Self <: Braces] (val x: Self) extends AnyVal {
    
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
    def setBraces(value: Boolean): Self = this.set("braces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrackets(value: Boolean): Self = this.set("brackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotdir(value: Boolean): Self = this.set("dotdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotfile(value: Boolean): Self = this.set("dotfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtglob(value: Boolean): Self = this.set("extglob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlob(value: Boolean): Self = this.set("glob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobstar(value: Boolean): Self = this.set("globstar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegated(value: Boolean): Self = this.set("negated", value.asInstanceOf[js.Any])
  }
}
