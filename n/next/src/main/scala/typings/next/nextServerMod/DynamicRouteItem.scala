package typings.next.nextServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.nextBooleans.`false`
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicRouteItem extends js.Object {
  
  var `match`: ReturnType[
    js.Function1[
      /* routeRegex */ ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getRouteRegex */ js.Any
      ], 
      js.Function1[
        /* pathname */ js.UndefOr[String | Null], 
        `false` | (StringDictionary[String | js.Array[String]])
      ]
    ]
  ] = js.native
  
  var page: String = js.native
}
object DynamicRouteItem {
  
  @scala.inline
  def apply(
    `match`: ReturnType[
      js.Function1[
        /* routeRegex */ ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getRouteRegex */ js.Any
        ], 
        js.Function1[
          /* pathname */ js.UndefOr[String | Null], 
          `false` | (StringDictionary[String | js.Array[String]])
        ]
      ]
    ],
    page: String
  ): DynamicRouteItem = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicRouteItem]
  }
  
  @scala.inline
  implicit class DynamicRouteItemOps[Self <: DynamicRouteItem] (val x: Self) extends AnyVal {
    
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
    def setMatch(
      value: ReturnType[
          js.Function1[
            /* routeRegex */ ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getRouteRegex */ js.Any
            ], 
            js.Function1[
              /* pathname */ js.UndefOr[String | Null], 
              `false` | (StringDictionary[String | js.Array[String]])
            ]
          ]
        ]
    ): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
  }
}
