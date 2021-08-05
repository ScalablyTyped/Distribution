package typings.mobxStateTree

import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.observablemapMod.IKeyValueMap
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.IMapWillChange
import typings.mobx.utilsMod.Lambda
import typings.mobxStateTree.hookMod.IHooksGetter
import typings.mobxStateTree.typeMod.ExtractCSTWithSTN
import typings.mobxStateTree.typeMod.IAnyType
import typings.mobxStateTree.typeMod.IType
import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("mobx-state-tree/dist/types/complex-types/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMapType[Items /* <: IAnyType */](`type`: IAnyType): /* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/map.IMapType<Items> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMapType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/map.IMapType<Items> */ Boolean]
  
  inline def map[IT /* <: IAnyType */](subtype: IT): IMapType[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(subtype.asInstanceOf[js.Any]).asInstanceOf[IMapType[IT]]
  
  @js.native
  trait IMSTMap[IT /* <: IAnyType */] extends StObject {
    
    def clear(): Unit = js.native
    
    def delete(key: String): Boolean = js.native
    
    def entries(): IterableIterator[
        js.Tuple2[
          String, 
          /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
        ]
      ] = js.native
    
    @JSName("forEach")
    def forEach_Type(
      callbackfn: js.Function3[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ /* value */ js.Any, 
          /* key */ String, 
          /* map */ this.type, 
          Unit
        ]
    ): Unit = js.native
    @JSName("forEach")
    def forEach_Type(
      callbackfn: js.Function3[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ /* value */ js.Any, 
          /* key */ String, 
          /* map */ this.type, 
          Unit
        ],
      thisArg: js.Any
    ): Unit = js.native
    
    def get(key: String): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
      ] = js.native
    
    def has(key: String): Boolean = js.native
    
    @JSName("intercept")
    def intercept_Type(
      handler: IInterceptor[
          IMapWillChange[
            String, 
            /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
          ]
        ]
    ): Lambda = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[
        IterableIterator[
          js.Tuple2[
            String, 
            /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
          ]
        ]
      ] = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def merge(other: js.Any): this.type = js.native
    def merge(other: IKeyValueMap[ExtractCSTWithSTN[IT]]): this.type = js.native
    /** Merge another object into this map, returns self. */
    @JSName("merge")
    def merge_TypeWithoutSTN(
      other: IMSTMap[
          IType[
            js.Any, 
            js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any
          ]
        ]
    ): this.type = js.native
    
    /**
      * Observes this object. Triggers for the events 'add', 'update' and 'delete'.
      * See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/observe
      * for callback details
      */
    @JSName("observe")
    def observe_Type(
      listener: js.Function1[
          /* changes */ IMapDidChange[
            String, 
            /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
          ], 
          Unit
        ]
    ): Lambda = js.native
    @JSName("observe")
    def observe_Type(
      listener: js.Function1[
          /* changes */ IMapDidChange[
            String, 
            /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
          ], 
          Unit
        ],
      fireImmediately: Boolean
    ): Lambda = js.native
    
    def put(value: ExtractCSTWithSTN[IT]): /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any = js.native
    
    def replace(values: js.Any): this.type = js.native
    def replace(values: IKeyValueMap[ExtractCSTWithSTN[IT]]): this.type = js.native
    @JSName("replace")
    def replace_TypeWithoutSTN(
      values: IMSTMap[
          IType[
            js.Any, 
            js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any
          ]
        ]
    ): this.type = js.native
    
    def set(key: String, value: ExtractCSTWithSTN[IT]): this.type = js.native
    
    val size: Double = js.native
    
    /**
      * Returns a shallow non observable object clone of this map.
      * Note that the values might still be observable. For a deep clone use mobx.toJS.
      */
    def toJS(): Map[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
      ] = js.native
    
    def toJSON(): IKeyValueMap[
        /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any
      ] = js.native
    
    /**
      * Returns a plain object that represents this map.
      * Note that all the keys being stringified.
      * If there are duplicating keys after converting them to strings, behaviour is undetermined.
      */
    def toPOJO(): IKeyValueMap[
        /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any
      ] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: typings.mobxStateTree.mobxStateTreeStrings.Map = js.native
    
    def values(): IterableIterator[
        /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
      ] = js.native
  }
  
  @js.native
  trait IMapType[IT /* <: IAnyType */]
    extends StObject
       with IType[
          js.UndefOr[
            IKeyValueMap[
              /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any
            ]
          ], 
          IKeyValueMap[
            /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any
          ], 
          IMSTMap[IT]
        ] {
    
    def hooks(hooks: IHooksGetter[IMSTMap[IT]]): IMapType[IT] = js.native
  }
}
