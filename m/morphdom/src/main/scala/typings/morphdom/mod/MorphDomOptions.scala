package typings.morphdom.mod

import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MorphDomOptions extends js.Object {
  var childrenOnly: js.UndefOr[Boolean] = js.native
  var getNodeKey: js.UndefOr[js.Function1[/* node */ Node, _]] = js.native
  var onBeforeElChildrenUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.native
  var onBeforeElUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.native
  var onBeforeNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.native
  var onBeforeNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.native
  var onElUpdated: js.UndefOr[js.Function1[/* el */ HTMLElement, Unit]] = js.native
  var onNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.native
  var onNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
}

object MorphDomOptions {
  @scala.inline
  def apply(): MorphDomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MorphDomOptions]
  }
  @scala.inline
  implicit class MorphDomOptionsOps[Self <: MorphDomOptions] (val x: Self) extends AnyVal {
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
    def setChildrenOnly(value: Boolean): Self = this.set("childrenOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildrenOnly: Self = this.set("childrenOnly", js.undefined)
    @scala.inline
    def setGetNodeKey(value: /* node */ Node => _): Self = this.set("getNodeKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetNodeKey: Self = this.set("getNodeKey", js.undefined)
    @scala.inline
    def setOnBeforeElChildrenUpdated(value: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean): Self = this.set("onBeforeElChildrenUpdated", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBeforeElChildrenUpdated: Self = this.set("onBeforeElChildrenUpdated", js.undefined)
    @scala.inline
    def setOnBeforeElUpdated(value: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean): Self = this.set("onBeforeElUpdated", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBeforeElUpdated: Self = this.set("onBeforeElUpdated", js.undefined)
    @scala.inline
    def setOnBeforeNodeAdded(value: /* node */ Node => Node): Self = this.set("onBeforeNodeAdded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeNodeAdded: Self = this.set("onBeforeNodeAdded", js.undefined)
    @scala.inline
    def setOnBeforeNodeDiscarded(value: /* node */ Node => Boolean): Self = this.set("onBeforeNodeDiscarded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeNodeDiscarded: Self = this.set("onBeforeNodeDiscarded", js.undefined)
    @scala.inline
    def setOnElUpdated(value: /* el */ HTMLElement => Unit): Self = this.set("onElUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnElUpdated: Self = this.set("onElUpdated", js.undefined)
    @scala.inline
    def setOnNodeAdded(value: /* node */ Node => Node): Self = this.set("onNodeAdded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNodeAdded: Self = this.set("onNodeAdded", js.undefined)
    @scala.inline
    def setOnNodeDiscarded(value: /* node */ Node => Unit): Self = this.set("onNodeDiscarded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNodeDiscarded: Self = this.set("onNodeDiscarded", js.undefined)
  }
  
}

