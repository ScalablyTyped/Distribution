package typings.nightwatch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.nightwatch.mod.EnhancedElementInstance
import typings.nightwatch.mod.EnhancedPageObjectSections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elements[Sections /* <: EnhancedPageObjectSections */] extends js.Object {
  /**
    * A map of Element objects (see [Enhanced Element Instances](https://github.com/nightwatchjs/nightwatch/wiki/Page-Object-API#enhanced-element-instances)) used by element selectors.
    */
  var elements: StringDictionary[
    EnhancedElementInstance[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object
    ]
  ] = js.native
  /**
    * The name of the page object as defined by its module name (not including the extension).
    * This is the same name used to access the `page` object factory from the page reference in the command API.
    */
  var name: String = js.native
  var section: Sections = js.native
  /**
    * This command is an alias to url and also a convenience method because when called without any arguments
    *  it performs a call to .url() with passing the value of `url` property on the page object.
    * Uses `url` protocol command.
    */
  def navigate(): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object = js.native
  def navigate(url: String): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object = js.native
  def navigate(url: String, callback: js.Function0[Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object = js.native
}

