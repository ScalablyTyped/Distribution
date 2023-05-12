package typings.oojsUi.OO.ui

import typings.oojs.OO.Factory
import typings.oojsUi.oojsUiStrings.clear
import typings.oojsUi.oojsUiStrings.down
import typings.oojsUi.oojsUiStrings.required
import typings.oojsUi.oojsUiStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApexTheme = Theme

type BlankTheme = Theme

type Deferrable[T] = T | js.Function0[T]

// #region Icon
/**
  * Represents an icon name. You need to load additional ResourceLoader modules to use these
  * icons. Please refer to OOUI documentation or the code here.
  *
  * Note: only use it as function parameters, otherwise it may break CFA.
  * @see https://doc.wikimedia.org/oojs-ui/master/demos/?page=icons&theme=wikimediaui&direction=ltr&platform=desktop
  */
type Icon = LiteralUnion[
/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 224, starting with typings.oojsUi.oojsUiStrings.arrowNext, typings.oojsUi.oojsUiStrings.arrowPrevious, typings.oojsUi.oojsUiStrings.collapse */ Any]

// #endregion
/**
  * Represents an indicator name.
  *
  * Note: only use it as function parameters, otherwise it may break CFA.
  * @see https://doc.wikimedia.org/oojs-ui/master/demos/?page=icons&theme=wikimediaui&direction=ltr&platform=desktop
  */
type Indicator = LiteralUnion[clear | up | down | required]

type LiteralUnion[T /* <: String */] = T | String

type Numberish = (/* template literal string: ${number} */ String) | Double

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.oojsUi.anon.Name
  - typings.oojsUi.anon.Group
*/
type ToolExtractionCollection = _ToolExtractionCollection | String

/**
  * ToolGroupFactories create {@link OO.ui.ToolGroup toolgroups} on demand. The toolgroup classes
  * must specify a symbolic name and be registered with the factory. The following classes are
  * registered by default:
  *
  * - {@link OO.ui.BarToolGroup BarToolGroups} (‘bar’)
  * - {@link OO.ui.MenuToolGroup MenuToolGroups} (‘menu’)
  * - {@link OO.ui.ListToolGroup ListToolGroups} (‘list’)
  *
  * See {@link OO.ui.Toolbar toolbars} for an example.
  *
  * For more information about toolbars in general, please see the
  * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Toolbars).
  *
  * ResourceLoader module: `oojs-ui-toolbars`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ToolGroupFactory
  */
type ToolGroupFactory = Factory

type WikimediaUITheme = Theme
