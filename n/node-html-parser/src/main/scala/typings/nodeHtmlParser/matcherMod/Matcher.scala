package typings.nodeHtmlParser.matcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matcher extends js.Object {
  var matchers: js.Any = js.native
  var nextMatch: js.Any = js.native
  /**
    * Trying to advance match pointer
    * @param  {HTMLElement} el element to make the match
    * @return {bool}           true when pointer advanced.
    */
  def advance(el: typings.nodeHtmlParser.htmlMod.default): Boolean = js.native
  /**
    * flush cache to free memory
    */
  def flushCache(): Unit = js.native
  /**
    * Trying to determine if match made.
    * @return {bool} true when the match is made
    */
  def matched: Boolean = js.native
  /**
    * Rest match pointer.
    * @return {[type]} [description]
    */
  def reset(): Unit = js.native
  /**
    * Rewind the match pointer
    */
  def rewind(): Unit = js.native
}

object Matcher {
  @scala.inline
  def apply(
    advance: typings.nodeHtmlParser.htmlMod.default => Boolean,
    flushCache: () => Unit,
    matched: () => Boolean,
    matchers: js.Any,
    nextMatch: js.Any,
    reset: () => Unit,
    rewind: () => Unit
  ): Matcher = {
    val __obj = js.Dynamic.literal(advance = js.Any.fromFunction1(advance), flushCache = js.Any.fromFunction0(flushCache), matched = js.Any.fromFunction0(matched), matchers = matchers.asInstanceOf[js.Any], nextMatch = nextMatch.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), rewind = js.Any.fromFunction0(rewind))
    __obj.asInstanceOf[Matcher]
  }
  @scala.inline
  implicit class MatcherOps[Self <: Matcher] (val x: Self) extends AnyVal {
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
    def setAdvance(value: typings.nodeHtmlParser.htmlMod.default => Boolean): Self = this.set("advance", js.Any.fromFunction1(value))
    @scala.inline
    def setFlushCache(value: () => Unit): Self = this.set("flushCache", js.Any.fromFunction0(value))
    @scala.inline
    def setMatched(value: () => Boolean): Self = this.set("matched", js.Any.fromFunction0(value))
    @scala.inline
    def setMatchers(value: js.Any): Self = this.set("matchers", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextMatch(value: js.Any): Self = this.set("nextMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setRewind(value: () => Unit): Self = this.set("rewind", js.Any.fromFunction0(value))
  }
  
}

