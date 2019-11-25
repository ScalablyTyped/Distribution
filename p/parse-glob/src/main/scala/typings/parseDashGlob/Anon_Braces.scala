package typings.parseDashGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Braces extends js.Object {
  /**
    * True if it has braces ({1..2} or .{txt,md}).
    */
  var braces: Boolean
  /**
    * True if it has POSIX brackets ([[:alpha:]]).
    */
  var brackets: Boolean
  /**
    * True if the pattern should match dot-directories (like .git).
    */
  var dotdir: Boolean
  /**
    * True if the pattern should match dotfiles.
    */
  var dotfile: Boolean
  /**
    * True if it has extglobs (@(foo|bar)).
    */
  var extglob: Boolean
  /**
    * True if the pattern actually is a glob pattern.
    */
  var glob: Boolean
  /**
    * True if the pattern has a globstar (double star, **).
    */
  var globstar: Boolean
  /**
    * True if it's a negation pattern (!/foo.js).
    */
  var negated: Boolean
}

object Anon_Braces {
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
  ): Anon_Braces = {
    val __obj = js.Dynamic.literal(braces = braces.asInstanceOf[js.Any], brackets = brackets.asInstanceOf[js.Any], dotdir = dotdir.asInstanceOf[js.Any], dotfile = dotfile.asInstanceOf[js.Any], extglob = extglob.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Braces]
  }
}

