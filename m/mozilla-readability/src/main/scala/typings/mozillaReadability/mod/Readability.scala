package typings.mozillaReadability.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A standalone version of the readability library used for Firefox Reader View.
  *
  * Note that isProbablyReaderable() was moved into a separate file in https://github.com/mozilla/readability/commit/2620542dd1e8380220d82afa97a2c283ae636e40
  * and therefore is no longer part of the Readability class.
  */
@js.native
trait Readability extends js.Object {
  /**
    * Runs readability.
    *
    * ## Workflow:
    *
    *  1. Prep the document by removing script tags, css, etc.
    *  2. Build readability's DOM tree.
    *  3. Grab the article content from the current dom tree.
    *  4. Replace the current DOM tree with the new one.
    *  5. Read peacefully.
    *
    * ## Additional notes:
    *
    * Readability's parse() works by modifying the DOM. This removes some
    * elements in the web page. You could avoid this by passing the clone
    * of the document object while creating a Readability object.
    *
    * ```js
    * var documentClone = document.cloneNode(true);
    * var article = new Readability(documentClone).parse();
    * ```
    *
    * The response will be null if the processing failed (https://github.com/mozilla/readability/blob/52ab9b5c8916c306a47b2119270dcdabebf9d203/Readability.js#L2038)
    */
  def parse(): ParseResult | Null = js.native
}

object Readability {
  @scala.inline
  def apply(parse: () => ParseResult | Null): Readability = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse))
    __obj.asInstanceOf[Readability]
  }
  @scala.inline
  implicit class ReadabilityOps[Self <: Readability] (val x: Self) extends AnyVal {
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
    def setParse(value: () => ParseResult | Null): Self = this.set("parse", js.Any.fromFunction0(value))
  }
  
}

