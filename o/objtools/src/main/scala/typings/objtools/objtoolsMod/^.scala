package typings.objtools.objtoolsMod

import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objtools", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def collapseToDotted(obj: Record[String, _]): Record[String, _] = js.native
  def collapseToDotted(obj: Record[String, _], includeRedundantLevels: Boolean): Record[String, _] = js.native
  def collapseToDotted(obj: Record[String, _], includeRedundantLevels: Boolean, stopAtArrays: Boolean): Record[String, _] = js.native
  def deepCopy(obj: js.Any): js.Any = js.native
  def deepEquals(a: js.Any, b: js.Any): Boolean = js.native
  def deletePath(obj: Record[String, _], path: String): Record[String, _] = js.native
  def diffObjects(objects: (Record[String, _])*): Record[String, _] = js.native
  @JSName("diffObjects")
  def diffObjects_Any(args: js.Any*): js.Any = js.native
  def dottedDiff(val1: js.Any, val2: js.Any): js.Array[String] = js.native
  def getDuplicates(arr: js.Array[_]): js.Array[_] = js.native
  def getPath(obj: Record[String, _], path: String): js.Any = js.native
  def getPath(obj: Record[String, _], path: String, allowSkipArrays: Boolean): js.Any = js.native
  def isEmpty(`val`: js.Any): Boolean = js.native
  def isEmptyArray(`val`: js.Any): Boolean = js.native
  def isEmptyObject(`val`: js.Any): Boolean = js.native
  def isPlainObject(`val`: js.Any): Boolean = js.native
  def isScalar(`val`: js.Any): Boolean = js.native
  def isTerminal(`val`: js.Any): Boolean = js.native
  def matchDottedObject(doc: Record[String, _], query: Record[String, _]): Boolean = js.native
  def matchObject(doc: Record[String, _], query: Record[String, _]): Boolean = js.native
  def merge(args: js.Any*): js.Any = js.native
  def merge[TTarget, TSource](target: TTarget, source: TSource): TTarget with TSource = js.native
  def merge[TTarget, TSource](target: TTarget, source: TSource, customizer: MergeCustomizer): TTarget with TSource = js.native
  def merge[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2): TTarget with TSource1 with TSource2 = js.native
  def merge[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2, customizer: MergeCustomizer): TTarget with TSource1 with TSource2 = js.native
  def merge[TTarget, TSource1, TSource2, TSource3](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3): TTarget with TSource1 with TSource2 with TSource3 = js.native
  def merge[TTarget, TSource1, TSource2, TSource3](
    target: TTarget,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: MergeCustomizer
  ): TTarget with TSource1 with TSource2 with TSource3 = js.native
  def merge[TTarget, TSource1, TSource2, TSource3, TSource4](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TTarget with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  def merge[TTarget, TSource1, TSource2, TSource3, TSource4](
    target: TTarget,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeCustomizer
  ): TTarget with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  def mergeHeavy(args: js.Any*): js.Any = js.native
  def mergeHeavy[TTarget, TSource](target: TTarget, source: TSource): TTarget with TSource = js.native
  def mergeHeavy[TTarget, TSource](target: TTarget, source: TSource, customizer: MergeCustomizer): TTarget with TSource = js.native
  def mergeHeavy[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2): TTarget with TSource1 with TSource2 = js.native
  def mergeHeavy[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2, customizer: MergeCustomizer): TTarget with TSource1 with TSource2 = js.native
  def mergeHeavy[TTarget, TSource1, TSource2, TSource3](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3): TTarget with TSource1 with TSource2 with TSource3 = js.native
  def mergeHeavy[TTarget, TSource1, TSource2, TSource3](
    target: TTarget,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: MergeCustomizer
  ): TTarget with TSource1 with TSource2 with TSource3 = js.native
  def mergeHeavy[TTarget, TSource1, TSource2, TSource3, TSource4](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TTarget with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  def mergeHeavy[TTarget, TSource1, TSource2, TSource3, TSource4](
    target: TTarget,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeCustomizer
  ): TTarget with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  def mergeLight(args: js.Any*): js.Any = js.native
  def mergeLight[TTarget, TSource](target: TTarget, source: TSource): TTarget with TSource = js.native
  def mergeLight[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2): TTarget with TSource1 with TSource2 = js.native
  def mergeLight[TTarget, TSource1, TSource2, TSource3](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3): TTarget with TSource1 with TSource2 with TSource3 = js.native
  def mergeLight[TTarget, TSource1, TSource2, TSource3, TSource4](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TTarget with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  def objectHash(obj: js.Any): String = js.native
  def sanitizeDate(value: js.Any): Date | Null = js.native
  def scalarEquals(a: js.Any, b: js.Any): Boolean = js.native
  def setPath(obj: Record[String, _], path: String, value: js.Any): Record[String, _] = js.native
  def syncObject(toObj: Record[String, _], fromObj: Record[String, _]): Record[String, _] = js.native
  def syncObject(toObj: Record[String, _], fromObj: Record[String, _], options: SyncObjectOptions): Record[String, _] = js.native
}

