package typings
package messengerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessengerOptions extends js.Object {
  /**
    * Extra classes to be appended to the container.
    */
  var extraClasses: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of messages to show at once.
    */
  var maxMessages: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default options for created messages.
    */
  var messageDefaults: js.UndefOr[MessageOptions] = js.undefined
  /**
    * Which locations should be tried when inserting the message container into the page.
    * The default is ['body']. It accepts a list to allow you to try a variety of places
    * when deciding what the optimal location is on any given page. This should generally
    * not need to be changed unless you are inserting the messages into the flow of the
    * document, rather than using messenger-fixed.
    */
  var parentLocations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * What theme are you using? Some themes have associated javascript, specifing this allows that js to run.
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object MessengerOptions {
  @scala.inline
  def apply(
    extraClasses: java.lang.String = null,
    maxMessages: scala.Int | scala.Double = null,
    messageDefaults: MessageOptions = null,
    parentLocations: js.Array[java.lang.String] = null,
    theme: java.lang.String = null
  ): MessengerOptions = {
    val __obj = js.Dynamic.literal()
    if (extraClasses != null) __obj.updateDynamic("extraClasses")(extraClasses)
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (messageDefaults != null) __obj.updateDynamic("messageDefaults")(messageDefaults)
    if (parentLocations != null) __obj.updateDynamic("parentLocations")(parentLocations)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[MessengerOptions]
  }
}

