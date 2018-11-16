package typings
package oclazyloadLib.oclazyloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOptionsConfig
  extends angularLib.angularMod.angularNs.IRequestShortcutConfig {
  /**
       * If true, bypasses browser cache by appending a timestamp to URLs. Defaults to true.
       */
  @JSName("cache")
  var cache_IOptionsConfig: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If set, will insert files immediately before the provided CSS selector, instead of the default behavior of inserting files immediately before the
       * last child of the <head> element. Defaults to undefined.
       */
  var insertBefore: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If true, a module config will be invoked each time the module is reloaded. Use with caution, as re-invoking configs can lead to unexpected results.
       * Defaults to false.
       */
  var reconfig: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, a module run block will be invoked each time the module is reloaded. Use with caution, as re-invoking run blocks can lead to unexpected results.
       * Defaults to false.
       */
  var rerun: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, will load files in a series, instead of in parallel. Defaults to false.
       */
  var serie: js.UndefOr[scala.Boolean] = js.undefined
}

