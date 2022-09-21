package typings.photonui.global.photonui

import typings.photonui.global.photonui.^
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Methods
inline def domInsert(widget: typings.photonui.photonui.Widget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("domInsert")(widget.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def domInsert(widget: typings.photonui.photonui.Widget, element: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("domInsert")(widget.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def domInsert(widget: typings.photonui.photonui.Widget, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("domInsert")(widget.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def getWidget(name: String): typings.photonui.photonui.Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(name.asInstanceOf[js.Any]).asInstanceOf[typings.photonui.photonui.Widget]
