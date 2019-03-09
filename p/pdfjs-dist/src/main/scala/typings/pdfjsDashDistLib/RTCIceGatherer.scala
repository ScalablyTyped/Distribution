package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceGatherer extends RTCStatsProvider {
  val component: RTCIceComponent = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onlocalcandidate: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def createAssociatedGatherer(): RTCIceGatherer = js.native
  def getLocalCandidates(): js.Array[RTCIceCandidateDictionary] = js.native
  def getLocalParameters(): RTCIceParameters = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_localcandidate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_localcandidate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_localcandidate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("RTCIceGatherer")
@js.native
object RTCIceGatherer
  extends org.scalablytyped.runtime.Instantiable1[/* options */ RTCIceGatherOptions, RTCIceGatherer]

