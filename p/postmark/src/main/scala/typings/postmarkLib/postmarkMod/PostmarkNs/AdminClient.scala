package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminClient extends js.Object {
  def createDomain(options: CreateDomain): js.UndefOr[scala.Nothing] = js.native
  def createDomain(options: CreateDomain, callback: PostmarkCallback[Domain]): js.UndefOr[scala.Nothing] = js.native
  @JSName("createDomain")
  def createDomain_Promise(options: CreateDomain): stdLib.Promise[Domain] = js.native
  def createSenderSignature(options: CreateSignature): js.UndefOr[scala.Nothing] = js.native
  def createSenderSignature(options: CreateSignature, callback: PostmarkCallback[SenderSignature]): js.UndefOr[scala.Nothing] = js.native
  @JSName("createSenderSignature")
  def createSenderSignature_Promise(options: CreateSignature): stdLib.Promise[SenderSignature] = js.native
  def createServer(options: CreateServer): js.UndefOr[scala.Nothing] = js.native
  def createServer(options: CreateServer, callback: PostmarkCallback[Server]): js.UndefOr[scala.Nothing] = js.native
  @JSName("createServer")
  def createServer_Promise(options: CreateServer): stdLib.Promise[Server] = js.native
  def deleteDomain(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def deleteDomain(id: scala.Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("deleteDomain")
  def deleteDomain_Promise(id: scala.Double): stdLib.Promise[GenericResult] = js.native
  def deleteSenderSignature(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def deleteSenderSignature(id: scala.Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("deleteSenderSignature")
  def deleteSenderSignature_Promise(id: scala.Double): stdLib.Promise[GenericResult] = js.native
  def deleteServer(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def deleteServer(id: scala.Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("deleteServer")
  def deleteServer_Promise(id: scala.Double): stdLib.Promise[GenericResult] = js.native
  def editDomain(id: scala.Double, options: stdLib.Partial[CreateDomain]): js.UndefOr[scala.Nothing] = js.native
  def editDomain(id: scala.Double, options: stdLib.Partial[CreateDomain], callback: PostmarkCallback[Domain]): js.UndefOr[scala.Nothing] = js.native
  @JSName("editDomain")
  def editDomain_Promise(id: scala.Double, options: stdLib.Partial[CreateDomain]): stdLib.Promise[Domain] = js.native
  def editSenderSignature(id: scala.Double, options: UpdateSignature): js.UndefOr[scala.Nothing] = js.native
  def editSenderSignature(id: scala.Double, options: UpdateSignature, callback: PostmarkCallback[SenderSignature]): js.UndefOr[scala.Nothing] = js.native
  @JSName("editSenderSignature")
  def editSenderSignature_Promise(id: scala.Double, options: UpdateSignature): stdLib.Promise[SenderSignature] = js.native
  def editServer(id: scala.Double, options: stdLib.Partial[CreateServer]): js.UndefOr[scala.Nothing] = js.native
  def editServer(id: scala.Double, options: stdLib.Partial[CreateServer], callback: PostmarkCallback[Server]): js.UndefOr[scala.Nothing] = js.native
  @JSName("editServer")
  def editServer_Promise(id: scala.Double, options: stdLib.Partial[CreateServer]): stdLib.Promise[Server] = js.native
  def getDomain(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def getDomain(id: scala.Double, callback: PostmarkCallback[Domain]): js.UndefOr[scala.Nothing] = js.native
  @JSName("getDomain")
  def getDomain_Promise(id: scala.Double): stdLib.Promise[Domain] = js.native
  def getServer(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def getServer(id: scala.Double, callback: PostmarkCallback[Server]): js.UndefOr[scala.Nothing] = js.native
  // servers
  @JSName("getServer")
  def getServer_Promise(id: scala.Double): stdLib.Promise[Server] = js.native
  def listDomains(query: Filter): js.UndefOr[scala.Nothing] = js.native
  def listDomains(query: Filter, callback: PostmarkCallback[DomainsResult]): js.UndefOr[scala.Nothing] = js.native
  // domains
  @JSName("listDomains")
  def listDomains_Promise(query: Filter): stdLib.Promise[DomainsResult] = js.native
  def listSenderSignatures(query: Filter): js.UndefOr[scala.Nothing] = js.native
  def listSenderSignatures(query: Filter, callback: PostmarkCallback[SenderSignaturesResults]): js.UndefOr[scala.Nothing] = js.native
  @JSName("listSenderSignatures")
  def listSenderSignatures_Promise(query: Filter): stdLib.Promise[SenderSignaturesResults] = js.native
  def listServers(query: ServerFilter): js.UndefOr[scala.Nothing] = js.native
  def listServers(query: ServerFilter, callback: PostmarkCallback[ServersResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("listServers")
  def listServers_Promise(query: ServerFilter): stdLib.Promise[ServersResult] = js.native
  def requestNewDKIMForSenderSignature(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def requestNewDKIMForSenderSignature(id: scala.Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("requestNewDKIMForSenderSignature")
  def requestNewDKIMForSenderSignature_Promise(id: scala.Double): stdLib.Promise[GenericResult] = js.native
  def resendSenderSignatureConfirmation(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def resendSenderSignatureConfirmation(id: scala.Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("resendSenderSignatureConfirmation")
  def resendSenderSignatureConfirmation_Promise(id: scala.Double): stdLib.Promise[GenericResult] = js.native
  def rotateDKIMForDomain(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def rotateDKIMForDomain(id: scala.Double, callback: PostmarkCallback[RotateDKIMResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("rotateDKIMForDomain")
  def rotateDKIMForDomain_Promise(id: scala.Double): stdLib.Promise[RotateDKIMResult] = js.native
  def verifyDomainSPF(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def verifyDomainSPF(id: scala.Double, callback: PostmarkCallback[SenderSignature]): js.UndefOr[scala.Nothing] = js.native
  @JSName("verifyDomainSPF")
  def verifyDomainSPF_Promise(id: scala.Double): stdLib.Promise[SenderSignature] = js.native
  def verifySenderSignatureSPF(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def verifySenderSignatureSPF(id: scala.Double, callback: PostmarkCallback[SenderSignature]): js.UndefOr[scala.Nothing] = js.native
  @JSName("verifySenderSignatureSPF")
  def verifySenderSignatureSPF_Promise(id: scala.Double): stdLib.Promise[SenderSignature] = js.native
}

