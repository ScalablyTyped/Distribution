package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropEvents extends js.Object {
  var canDrag: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  var canDrop: js.UndefOr[
    js.Function2[
      /* dropContext */ js.UndefOr[IDragDropContext], 
      /* dragContext */ js.UndefOr[IDragDropContext], 
      scala.Boolean
    ]
  ] = js.undefined
  var onDragEnd: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[reactLib.DragEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDragEnter: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[reactLib.DragEvent], 
      java.lang.String
    ]
  ] = js.undefined
  var onDragLeave: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[reactLib.DragEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDragStart: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* itemIndex */ js.UndefOr[scala.Double], 
      /* selectedItems */ js.UndefOr[js.Array[_]], 
      /* event */ js.UndefOr[reactLib.MouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onDrop: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[reactLib.DragEvent], 
      scala.Unit
    ]
  ] = js.undefined
}

